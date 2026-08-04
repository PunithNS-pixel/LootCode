class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       // Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        //int min = nums[0];
        //int max = nums[nums.length-1];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list = new ArrayList<>();
        int n = max-min;
        for(int i=0;i<n;i++){
            if(!map.containsKey(min)){
                list.add(min);
            }
            min=min+1;
        }
        return list;

    }
}