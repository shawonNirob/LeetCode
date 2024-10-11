class Solution {
    boolean[][][] isVisited = new boolean[100][100][101];

    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        return dfs(grid, 0, 0, 0, m, n);
    }

    public boolean dfs(char[][] grid, int row, int col, int open, int m, int n){
        if(grid[row][col]=='(') open++;
        else open--;

        if(open < 0 || open > (m+n)/2 || isVisited[row][col][open]) return false;
        isVisited[row][col][open] = true;

        if(open == 0 && row == m-1 && col == n-1) return true;

        if(row+1 < m && dfs(grid, row+1, col, open, m, n)) return true;
        if(col+1 < n && dfs(grid, row, col+1, open, m, n)) return true;

        return false;
    }
}