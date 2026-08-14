class Solution {
    public int maximumLengthSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];
            int length = 0;
            for (int j = i; j < s.length(); j++) {
                int ch = s.charAt(j) - 'a';
                freq[ch]++;
                if (freq[ch] > 2) {
                    break;
                }
                length++;
                max = Math.max(max, length);
            }
        }
        return max;
    }
}