class Solution {
    public int pivotIndex(int[] nums) {
             int pre[]=new int[nums.length];
        int suf[]=new int[nums.length];
        int presum=0;
        for(int i=0;i<nums.length;i++){
        presum+=nums[i];
        pre[i]=presum;
        }
        int sufsum=0,j=0;
        for(int i=nums.length-1;i>=0;i--){
        sufsum+=nums[i];
        suf[i]=sufsum;
        }
        for(int i=0;i<nums.length;i++){
        if(pre[i]==suf[i])return i;
        }        
        return -1;
    }
}