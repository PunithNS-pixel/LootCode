class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                max = Math.max(max, dfs(grid, i, j));
            }
        }
        return max;
    }

    public int dfs(int[][] grid, int r, int c) {
        int count = 0;
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }
        grid[r][c] = 0;

        int left = dfs(grid, r - 1, c);
        int right = dfs(grid, r + 1, c);
        int up = dfs(grid, r, c - 1);
        int down = dfs(grid, r, c + 1);
        return 1 + up + down + left + right;
    }
}