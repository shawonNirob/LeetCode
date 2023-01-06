class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid2.length;
        int n = grid2[0].length;
        
        int result = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                
                if(grid1[i][j]==0 && grid2[i][j]==1){
                    dfs(i, j, grid2, m, n);
                }
            }
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){         
                if(grid2[i][j]==1){
                    result++;
                    dfs(i, j, grid2, m, n);
                }
            }
        }
        
        return result;
    }
                            
    public void dfs(int r, int c, int[][] grid2, int m, int n){
        if(r<0 || r>=m || c<0 || c>=n || grid2[r][c]==0) return;
        
        grid2[r][c] = 0;
        
        dfs(r+1, c, grid2, m, n);
        dfs(r-1, c, grid2, m, n);
        dfs(r, c-1, grid2, m, n);
        dfs(r, c+1, grid2, m, n);
    }
}