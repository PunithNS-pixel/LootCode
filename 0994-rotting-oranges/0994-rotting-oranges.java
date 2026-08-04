class Solution {
    public int orangesRotting(int[][] grid) {
        int minutes = 0;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[] { i, j });
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if (fresh == 0) {
            return 0;
        }
        int[][] directions = {
                { -1, 0 },
                { 1, 0 },
                { 0, -1 },
                { 0, 1 }
        };
        while (!q.isEmpty() && fresh > 0){
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] cell = q.poll();
                int row = cell[0];
                int col = cell[1];
                for (int[] dir : directions) {
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];
                    if (newRow < 0 ||
                            newCol < 0 ||
                            newRow >= grid.length ||
                            newCol >= grid[0].length) {
                        continue;
                    }
                    if (grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        fresh--;
                        q.offer(new int[] { newRow, newCol });
                    }
                }
            }
            minutes++;
        }
        if (fresh == 0)
            return minutes;

        return -1;
    }
}