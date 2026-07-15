class Solution {
    public int gcdOfOddEvenSums(int n) {
        int esum=0,osum=0;
        for(int i=2;i<2*n;i+=2){
            esum+=i;
        }
        for(int i=1;i<(2*n)-1;i+=2){
            osum+=i;
        }
        int x = gcd(osum,esum)+1;
        return x;
    }

    public int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}