class Solution {
    public void solve(char[][] board) {

        int rows = board.length;
        int cols = board[0].length;
        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O') {
                dfs(board, 0, j);
            }
        }
        for (int j = 0; j < cols; j++) {
            if (board[rows - 1][j] == 'O') {
                dfs(board, rows - 1, j);
            }
        }
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0);
            }
        }
        for (int i = 0; i < rows; i++) {
            if (board[i][cols - 1] == 'O') {
                dfs(board, i, cols - 1);
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='T'){
                    board[i][j]='O';
                }
                else{
                    board[i][j]='X';
                }
            }
        }
    }
    public void dfs(char[][]grid,int r,int c){
        if(r<0||c<0||c>=grid[0].length||r>=grid.length||grid[r][c]!='O'){
            return;
        }
        grid[r][c]='T';
        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }
}