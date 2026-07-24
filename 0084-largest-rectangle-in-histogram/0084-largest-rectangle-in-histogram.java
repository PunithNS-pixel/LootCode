class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max=0;
        for(int i=0;i<=heights.length;i++){
            int curr = (i == heights.length) ? 0 : heights[i];
            while(!stack.isEmpty()&&heights[stack.peek()]>curr){
                int height = heights[stack.pop()];
                int left = stack.isEmpty()?-1:stack.peek();
                int right = i;
                int width  = right -left -1;
                max = Math.max(max,width*height);
            }
            stack.push(i);
        }
        return max;
    }
}