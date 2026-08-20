class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        arr1[0] = nums[0];
        arr2[0] = nums[1];
        int j = 1, k = 1;
        for (int i = 2; i < nums.length; i++) {
            if (arr1[j - 1] > arr2[k - 1]) {
                arr1[j++] = nums[i];
            } else {
                arr2[k++] = nums[i];
            }
        }
        int res[] = new int[nums.length];
        int l = 0;
        for (int i = 0; i < j; i++) {
            res[l++] = arr1[i];
        }
        for (int i = 0; i < k; i++) {
            res[l++] = arr2[i];
        }
        return res;
    }
}