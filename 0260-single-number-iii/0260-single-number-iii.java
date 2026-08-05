class Solution {
    public int[] singleNumber(int[] nums) {
        int a = 0;
        for (int x : nums) {
            a ^= x;
        }
        int mask = a & (-a);
        int group1 = 0;
        int group2 = 0;
        for (int x : nums) {
            if ((x & mask) == 0) {

                group1 ^= x;

            } else {

                group2 ^= x;

            }

        }
        return new int[]{group1,group2};
    }
}