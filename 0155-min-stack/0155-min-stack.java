class MinStack {
    int[] stack;
    int[] minstack;
    int top;
    int top1;
    public MinStack() {
        stack=new int[100000];
        minstack=new int[100000];
        top=-1;
        top1=-1;
    }
    
    public void push(int value) {
        if(top==stack.length-1)return;
        if(top==-1){
            minstack[++top1]=value;
            stack[++top]=value;
            return;
        }
        stack[++top] = value;

        int currentMin = minstack[top1];
        minstack[++top1] = Math.min(currentMin, value);

    }
    
    public void pop() {
        if(top==-1)return;
        top--;
        top1--;
    }
    
    public int top() {
        if(top==-1)return -1;
        return stack[top];
    }
    
    public int getMin() {
        if(top1==-1)return -1;
        return minstack[top1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */