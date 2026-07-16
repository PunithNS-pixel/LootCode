class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i == n) return 0;
        boolean negative = false;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-') {
                negative = true;
            }
            i++;
        }
        StringBuilder str = new StringBuilder();
        while (i < n && Character.isDigit(s.charAt(i))) {
            str.append(s.charAt(i));
            i++;
        }
        if (str.length() == 0) return 0;
        if (negative) {
            str.insert(0, '-');
        }
        try {
            return Integer.parseInt(str.toString());
        } catch (NumberFormatException e) {
            return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}