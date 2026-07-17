class MinStack {

    Stack<Integer> arr = new Stack<>();
    Stack<Integer> arr1 = new Stack<>();

    public MinStack() {

    }

    public void push(int value) {

        arr.push(value);

        if (arr1.isEmpty()) {
            arr1.push(value);
        } else {
            arr1.push(Math.min(value, arr1.peek()));
        }

    }

    public void pop() {
        int x = arr.pop();
        int y = arr1.pop();
    }

    public int top() {
        return arr.peek();

    }

    public int getMin() {
        return arr1.peek();
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