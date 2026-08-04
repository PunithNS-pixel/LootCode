class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] ans = new int[nums.length+1];
        Arrays.fill(ans,-1);
        for(int i=0;i<nums.length;i++){
            ans[nums[i]]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length+1;i++){
            if(ans[i]>0){
                list.add(i);
            }
        }
        return list;
    }
}