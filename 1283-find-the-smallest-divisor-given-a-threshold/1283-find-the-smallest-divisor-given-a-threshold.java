class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low =1;
        int high = 0;
        for(int x:nums){
            high=Math.max(high,x);
        }
        int ans = high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(mid,nums,threshold)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean check(int n,int[] nums,int thresold){
        int x=0;
        for(int a:nums){
           x += (a + n - 1) / n;
    }
    return x<=thresold;
    }
}