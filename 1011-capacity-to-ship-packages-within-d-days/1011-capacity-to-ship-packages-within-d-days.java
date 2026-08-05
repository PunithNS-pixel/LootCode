class Solution {
    public int shipWithinDays(int[] weights, int days) {
    int low =0;
        for(int x:weights){
            low=Math.max(low,x);
        }
        int high=0;
        for(int x:weights){
            high+=x;
        }
        int ans=high;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(check(mid,weights,days)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean check(int n,int[] weights,int days){
        int day=1;
        int currentload=0;
        for(int wt:weights){
            if(wt+currentload>n){
                day++;
                currentload=wt;
            }
            else{
                currentload+=wt;
            }
        }
        return day<=days;
    }
}