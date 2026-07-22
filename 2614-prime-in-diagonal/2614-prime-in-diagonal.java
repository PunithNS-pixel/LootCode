class Solution {
    public int diagonalPrime(int[][] nums) {
        int max=0;
        for(int i=0;i<nums[0].length;i++){
            for(int j=0;j<nums.length;j++){
                if(isprime(nums[i][i]))
                {
                    max=Math.max(max, nums[i][i]);
                }
                if(isprime(nums[i][nums.length-i-1])){
                    max=Math.max(max, nums[i][nums.length-i-1]);
                }
            }
        }
        return max;
    }
    public  boolean isprime(int n) {
    if (n <= 1) return false;

    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }

    return true;
}
}