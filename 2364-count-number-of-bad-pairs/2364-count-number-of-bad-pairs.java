class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Long> map = new HashMap<>();
        long goodPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i] - i;

            if (map.containsKey(key)) {
                goodPairs += map.get(key);
            }

            map.put(key, map.getOrDefault(key, 0L) + 1);
        }

        long n = nums.length;
        long totalPairs = n * (n - 1) / 2;

        return totalPairs - goodPairs;
    }
}