class Solution {
    public int addDigits(int num) {
        if(num>=0&&num<10)return num;
        int sum=add(num);
        while(sum%10!=sum){
            sum=add(sum);
        }
        return sum;
    }
    public int add(int n){
        int rem=0,sum=0;
        while(n>0){
            rem=n%10;
            n=n/10;
            sum+=rem;
        }
        return sum;
    }
}