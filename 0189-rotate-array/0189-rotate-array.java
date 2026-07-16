class Solution {
    public void rotate(int[] nums, int k) {
        int temp[] = new int[nums.length];
        int j=0;
        k=k%nums.length;
        for(int i=nums.length-k;j<k;i++){
            temp[j]=nums[i];
            j++;
        }
        int l=k;
        for(int i=0;i<nums.length-k;i++){
            temp[l]=nums[i];
            l++;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
    }
}