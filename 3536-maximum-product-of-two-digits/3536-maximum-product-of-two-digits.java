class Solution {
    public int maxProduct(int n) {
        String s = String.valueOf(n);
        int max1=0,max2=0;
        int pro=1,rem=0,i=1;
        while(n>0){
            rem=n%10;
           if(rem>max1){
            max2=max1;
            max1=rem;
           }
           else if(rem>max2){
            max2=rem;
           }
                       n=n/10;
        }
        return max1*max2;
    }
}