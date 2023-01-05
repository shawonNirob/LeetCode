class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] r = new int[]{1,-1,0,0};
        int[] c = new int[]{0,0,-1,1};
        int island = 0;
        boolean[][] isVisited = new boolean[m][n];
        
         for(int i=0; i<m; i++){
             for(int j=0; j<n; j++){
                 if(!isVisited[i][j] && grid[i][j]=='1'){
                     Queue<int[]> queue = new LinkedList();
                     queue.add(new int[]{i, j});
                     isVisited[i][j] = true;
                     
                     island++;
                     
                     while(!queue.isEmpty()){
                         int[] node = queue.poll();
                         
                         for(int k=0; k<4; k++){
                            int row = r[k]+node[0]; int col = c[k]+node[1];
                             
                            if(row >= 0 && row<m && col>=0 && col< n && !isVisited[row][col] && grid[row][col]=='1'){
                                isVisited[row][col] = true;
                                queue.add(new int[]{row, col});
                            }
                         }
                     }
                 }
             }
         }
        return island;
    }
}