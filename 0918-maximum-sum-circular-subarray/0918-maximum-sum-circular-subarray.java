class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=Integer.MIN_VALUE,sum=0,min=Integer.MAX_VALUE,curr=0,total=0;
        for(int i=0;i<nums.length;i++){
            sum=Math.max(nums[i],nums[i]+sum);
            max=Math.max(max,sum);
            curr=Math.min(nums[i],nums[i]+curr);
            min=Math.min(min,curr);
            total+=nums[i];
        }
        if(max<0)return max;
        return (Math.max(max,total-min));
    }
}