class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode headC = null;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != null) {
            headC = inslast(headC, slow.val);
            if (slow.next == null) break;
            slow = slow.next.next;
        }
        while (fast != null) {
            headC = inslast(headC, fast.val);
            if (fast.next == null) break;
            fast = fast.next.next;
        }
        return headC;
    }
    public ListNode inslast(ListNode headC, int data) {
        ListNode newnode = new ListNode(data);
        if (headC == null) {
            return newnode;
        }
        ListNode temp = headC;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        return headC;
    }
}