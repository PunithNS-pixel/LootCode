class Solution {
    public int pairSum(ListNode head) {
        Stack<Integer> stac=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            stac.push(temp.val);
            temp=temp.next;
        }
        ListNode dummy=head;
        int max=0;
        while(dummy!=null){
            int sum=dummy.val+stac.pop();
            max=Math.max(max,sum);
            dummy=dummy.next;
        }
        return max;
    }
}