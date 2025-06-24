class Node{
    String data;
    Node next;
    Node prev;

    Node(String data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class BrowserHistory {
    Node curr;

    BrowserHistory(){
        this.curr = null;
    }

    public BrowserHistory(String homepage) {
        curr = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        curr.next = null;
        curr.next = newNode;
        newNode.prev = curr;
        curr = newNode;
    }
    
    public String back(int steps) {
        while(curr.prev!=null && steps>0){
            curr = curr.prev;
            steps--;
        }return curr.data;
    }
    
    public String forward(int steps) {
        while(curr.next!=null && steps>0){
            curr = curr.next;
            steps--;
        }return curr.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */