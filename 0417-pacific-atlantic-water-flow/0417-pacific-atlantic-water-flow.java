class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        int m = heights.length;
        int n = heights[0].length;
        
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];       
        
        for(int i=0; i<m; i++){
            dfs(Integer.MIN_VALUE, i, 0, heights, pacific, m, n);
            dfs(Integer.MIN_VALUE, i, n-1, heights, atlantic, m, n);
        }
        
        for(int j=0; j<n; j++){
            dfs(Integer.MIN_VALUE, 0, j, heights, pacific, m, n);
            dfs(Integer.MIN_VALUE, m-1, j, heights, atlantic, m, n);
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(pacific[i][j] && atlantic[i][j]){
                    result.add(Arrays.asList(i,j));
                }
            }
        }
        
        
        return result;
    }
    public void dfs(int parr, int r, int c, int[][] heights, boolean[][] visited, int m, int n){
        
        if(r<0 || r>=m || c<0 || c>=n || parr > heights[r][c] || visited[r][c]) return; 
        
        visited[r][c] = true;
        
        int[] rp = {0, 0, -1, 1};
        int[] cp = {-1, 1, 0, 0};
        
        for(int i=0; i<4; i++){
            int row = r+rp[i];
            int col = c+cp[i];
            
            dfs(heights[r][c], row, col, heights, visited, m, n);
        }
    }
}