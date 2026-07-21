class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
            temp.add(nums[i]);
            backtrack(i,nums,temp,target-nums[i]);
            temp.remove(temp.size()-1);
        }
    }
}
