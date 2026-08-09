class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        double avg =Integer.MIN_VALUE;
        double sum=0.00;
        for(int right=0;right<nums.length;right++){
            sum=(sum+nums[right]);
            if(right-left+1==k){
                avg=Math.max(avg,sum/k);
                sum-=nums[left];
                left++;
            }
        }
        return avg;
    }
}