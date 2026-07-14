class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = recadd(slow);
            fast = recadd(recadd(fast));
        } while (slow != fast);

        return slow == 1;
    }

    public int recadd(int n){
        int rem=0;
        while(n>0){
            rem+=((n%10)*(n%10));
            n=n/10;
        }
        return rem;
    }
}