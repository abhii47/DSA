class Solution {
    public boolean checkList(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            if (!list.get(start).equals(list.get(end))) {
                return false; // Only return false when mismatch happens
            }
            start++;
            end--;
        }
        return true; // If all matched, it's a palindrome
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        return checkList(list);
    }
}
