/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy =new ListNode(0);
        dummy.next=head;
        ListNode prev = null, traverse = head;
        int count = 0;
        ListNode tprev = dummy;
        while (traverse != null) {
            count++;
             if (count == left) {
                ListNode start = traverse;
                ListNode  temp=traverse;
                int k = right - left + 1;
                while (temp != null && (k > 0)) {
                    ListNode next= temp.next;
                    temp.next = prev;
                    prev = temp;
                    temp = next;
                    k--;
                }
                tprev.next = prev;
                start.next = temp;
            
            }
            tprev = traverse;
            traverse = traverse.next;
        }
        return dummy.next;
    }
}