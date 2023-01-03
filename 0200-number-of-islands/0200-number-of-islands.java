class Solution {
    public int numIslands(char[][] grid) {
        int island = 0;
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];
        for(int i= 0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                isVisited[i][j] = false;
            }
        }
        
        for(int i= 0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(!isVisited[i][j] && grid[i][j]=='1'){
                     island++;
                     dfs(i, j, grid.length, grid[0].length, grid, isVisited);
                }
            }
        }
        return island;
    }
    public void dfs(int row, int col, int m, int n, char[][] grid, boolean[][] isVisited){
        if(row<0 || row >= m || col<0 || col>=n || isVisited[row][col] || grid[row][col] != '1') return;
        isVisited[row][col] = true;
        
        dfs(row+1, col, m, n, grid, isVisited);
        dfs(row-1, col, m, n, grid, isVisited);
        dfs(row, col-1, m, n, grid, isVisited);
        dfs(row, col+1, m, n, grid, isVisited);
    }
}