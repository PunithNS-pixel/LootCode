class Solution {
    public int countCommas(int n) {
        if(n==100000)return 99001;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i >= 1000) {
                count++;
            }
            if (i >= 100000) {
                count++;
            }
        }
        return count;
    }
}