class Solution {
    public int smallestNumber(int n, int t) {
        int ans=1;
        int m=n;
        int rem=0;
        while(n>0){
            rem=n%10;
            ans*=rem;
            n/=10;
        }
        for(int i=m;i<m*10;i++){
            int temp=i;
            int abc=1;
            while(temp>0){
            rem=temp%10;
            abc*=rem;
        temp/=10;
        }
        if(abc%t==0){
            return i;
        }

        }
        return 0;
    }
}