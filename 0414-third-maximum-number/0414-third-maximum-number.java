class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            if(!pq.contains(nums[i])){
                pq.offer(nums[i]);
            }
        }
        if(pq.size()<3){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        while(pq.size()>3){
            pq.poll();
        }
        return pq.peek();
    }
}