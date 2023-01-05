class Solution {
    private int area;
    public int maxAreaOfIsland(int[][] grid){
        int maxArea = 0;
        boolean[][] isVisited = new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(!isVisited[i][j] && grid[i][j]== 1){
                    area = 0;
                    dfs(i,j,grid,isVisited,grid.length,grid[0].length);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
    public void dfs(int row,int col,int[][] grid,boolean[][] isVisited, int m, int n){
        if(row<0 || row>=m || col<0 ||col>=n || isVisited[row][col] || grid[row][col]!=1) return;
        
        isVisited[row][col] = true;
        area += 1;
        
        dfs(row+1,col,grid,isVisited,m,n);
        dfs(row-1,col,grid,isVisited,m,n);
        dfs(row,col+1,grid,isVisited,m,n);
        dfs(row,col-1,grid,isVisited,m,n);
    }
}