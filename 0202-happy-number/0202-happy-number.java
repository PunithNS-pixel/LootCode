class Solution {
    public boolean isHappy(int n) {
    HashSet<Integer> set = new HashSet<>();
    while(n!=1&&!set.contains(n)){
        set.add(n);
        n=recadd(n);
    }
    return n==1;
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
