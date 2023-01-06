class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid2.length;
        int n = grid2[0].length;
        boolean[][] isVisited = new boolean[m][n];
        
        int result = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                
                if(!isVisited[i][j] && grid2[i][j]==1){
                    if(dfs(i,j,grid1,grid2,m,n,isVisited)) result++;
                }
            }
        }
        return result;
    }
                            
    public boolean dfs(int r, int c, int[][] grid1, int[][] grid2, int m, int n, boolean[][] isVisited){
        if(r<0 || r>=m || c<0 || c>=n || isVisited[r][c] || grid2[r][c]==0) return true;
            
        isVisited[r][c] = true;
        boolean isTrue = true;
        if(grid1[r][c]==0) isTrue = false;
        
        isTrue = dfs(r+1, c, grid1, grid2, m, n, isVisited) && isTrue;
        isTrue = dfs(r-1, c, grid1, grid2, m, n, isVisited) && isTrue;
        isTrue = dfs(r, c-1, grid1, grid2, m, n, isVisited) && isTrue;
        isTrue = dfs(r, c+1, grid1, grid2, m, n, isVisited) && isTrue;
        
        return isTrue;
    }
}