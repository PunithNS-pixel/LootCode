class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(0,candidates,new ArrayList<>(),target);
        return ans;
    }

    public void backtrack(int start,int nums[],List<Integer> temp,int target){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=start;i<nums.length;i++){
            if (i > start && nums[i] == nums[i - 1])continue;
            temp.add(nums[i]);
            backtrack(i+1,nums,temp,target-nums[i]);
            temp.remove(temp.size()-1);
        }
    }
}