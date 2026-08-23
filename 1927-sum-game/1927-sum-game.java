class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int diff = 0;
        int q = 0;

        for (int i = 0; i < n; i++) {
            char c = num.charAt(i);

            if (c == '?') {
                q += (i < n / 2) ? 1 : -1;
            } else {
                diff += (i < n / 2)
                        ? c - '0'
                        : -(c - '0');
            }
        }
        if (q != 0) {
            if (q % 2 != 0) return true;

            return diff != -9 * (q / 2);
        }
        return diff != 0;
    }
}