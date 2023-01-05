class Solution {

    public int maxAreaOfIsland(int[][] grid){
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];
        int maxArea = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(!isVisited[i][j] && grid[i][j]== 1){
                    maxArea = Math.max(maxArea, dfs(i,j,grid,isVisited,grid.length,grid[0].length));
                }
            }
        }
        return maxArea;
    }
    public int dfs(int row,int col,int[][] grid,boolean[][] isVisited, int m, int n){
        if(row<0 || row>=m || col<0 ||col>=n || isVisited[row][col] || grid[row][col]!=1) return 0;
        
        isVisited[row][col] = true;
        
        return 1 + (dfs(row+1,col,grid,isVisited,m,n) + dfs(row-1,col,grid,isVisited,m,n) + dfs(row,col+1,grid,isVisited,m,n) + dfs(row,col-1,grid,isVisited,m,n));

    }
}