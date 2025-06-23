/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node dummy = new Node(-1);
        Node head2 = dummy;
        Node temp = head;
        while(temp!=null){
            Node newNode = new Node(temp.val);
            map.put(temp,newNode);
            dummy.next = newNode;
            dummy = dummy.next;
            temp = temp.next;
        }
        temp = head;
        dummy = head2.next;
        while(temp!=null){
            dummy.random = map.get(temp.random);
            dummy  = dummy.next;
            temp = temp.next;
        }return head2.next;
    }
}