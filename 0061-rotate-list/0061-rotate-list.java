class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode slow = head;
        int count = 0;
        while (slow != null) {
            slow = slow.next;
            count++;
        }
        k = k % count;
        if (k == 0) {
            return head;
        }
        int n = count - k;
        ListNode temp = head;
        ListNode prev = null;
        int i = 0;
        while (i < n) {
            prev = temp;
            temp = temp.next;
            i++;
        }
        prev.next = null;
        ListNode newHead = temp;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        return newHead;
    }
}