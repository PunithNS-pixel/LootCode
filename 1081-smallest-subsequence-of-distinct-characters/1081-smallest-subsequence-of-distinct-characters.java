class Solution {
    public String smallestSubsequence(String s) {
        int[] last = new int[26];
        boolean[] used = new boolean[26];

        for (int i = 0; i < s.length(); i++)
            last[s.charAt(i) - 'a'] = i;

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (used[c - 'a'])
                continue;

            while (!st.isEmpty() &&
                   st.peek() > c &&
                   last[st.peek() - 'a'] > i) {

                used[st.pop() - 'a'] = false;
            }

            st.push(c);
            used[c - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty())
            ans.append(st.pop());

        return ans.reverse().toString();
    }
}