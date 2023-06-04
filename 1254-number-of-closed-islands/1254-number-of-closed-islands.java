class Solution {
    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==0 && (i==0 || j==0 || i==m-1 || j==n-1)){
                    dfs(i, j, visited, grid, m, n);
                }
            }
        }
        
        int islands = 0;
        
        for(int i=1; i<m-1; i++){
            for(int j=1; j<n-1; j++){
                if(!visited[i][j] && grid[i][j]==0){
                    dfs(i, j, visited, grid, m, n);
                    islands++;
                }
            }
        }
        
        return islands;
    }
    public void dfs(int row, int col, boolean[][] visited, int[][] grid, int m, int n){
        
        int[] rp = {0, 0, -1, 1};
        int[] cp = {-1, 1, 0, 0};
        
        visited[row][col] = true;
        
        for(int i=0; i<4; i++){
            int r = row+rp[i];
            int c = col+cp[i];
            
            if(r>=0 && r<m && c>=0 && c<n && !visited[r][c] && grid[r][c]==0){
                dfs(r, c, visited, grid, m, n);
            }
        }
    }
}