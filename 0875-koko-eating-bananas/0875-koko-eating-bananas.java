class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low =1;
        int high=0;
        for(int x:piles){
            high=Math.max(high,x);
        }
        int ans=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(check(mid,piles,h)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public boolean check(int n,int piles[],int h){
        long hrs=0;
        for(int i=0;i<piles.length;i++){
            hrs+=(piles[i]+n-1)/n;
        }
        return hrs<=h;
    }
}