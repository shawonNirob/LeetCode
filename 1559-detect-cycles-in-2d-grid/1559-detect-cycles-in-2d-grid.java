class Solution {
    public boolean containsCycle(char[][] grid) {
        int[][] visit = new int[grid.length][grid[0].length];
        
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(visit[i][j]==0 && dfs(i,j,i,j, visit,grid, 1, grid[i][j])) return true;
            }
        }
                   
        return false;
    }
    public boolean dfs(int r,int c,int prevR, int prevC,  int[][] visit, char[][] grid, int count, char word){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]!=word) return false;
        
        if(visit[r][c] - visit[prevR][prevC] >= 3) return true;
        
        if(visit[r][c]!=0) return false;
        
        visit[r][c] = count;
        
        return dfs(r+1, c, r, c, visit, grid, count+1, word) || dfs(r-1, c,r,c, visit, grid, count+1, word) || dfs(r, c+1,r,c, visit, grid, count+1, word) || dfs(r, c-1,r,c, visit, grid, count+1, word);
        
    }
}