class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())
            return false;
        for (int start = 0; start < s.length(); start++) {
            int j = 0;
            while (j < s.length() && s.charAt((start + j) % s.length()) == goal.charAt(j)) {
                j++;
            }
            if (j == s.length()) {
                return true;
            }
        }
        return false;
    }
}