class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int n = prices.length;
        for (int i = n - 1; i >= 0; i--) {
            int current = prices[i];
            while (!st.isEmpty() && st.peek() > prices[i])
                st.pop();
            if (!st.isEmpty())
                prices[i] -= st.peek();

            st.push(current);
        }
        return prices;
    }
}