class Solution {
    public int maxVowels(String s, int k) {
        int left = 0, count = 0, res = 0;
        for (int right = 0; right < s.length(); right++) {
            if (isVowel(s.charAt(right)))
                count++;
            if (right - left + 1 == k) {
                res = Math.max(res, count);
                if (isVowel(s.charAt(left)))
                    count--;
                left++;
            }

        }
        return res;
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}