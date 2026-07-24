class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int prev = stack.pop();
                int sum = prev + stack.peek();
                stack.push(prev);
                stack.push(sum);
            }
            else if(operations[i].equals("D")){
                int mul =2*stack.peek();
                stack.push(mul);
            }
            else if(operations[i].equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        int to=0;
        int size=stack.size();
        for(int i=0;i<size;i++){
            to+=stack.pop();
        }
        return to;
    }
}