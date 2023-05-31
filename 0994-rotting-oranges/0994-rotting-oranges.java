class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        
        Queue<Triple> queue = new LinkedList<>();
        
        int freshOrange = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 2){
                    visited[i][j] = true;
                    queue.add(new Triple(i, j, 0));
                }
                if(grid[i][j] == 1) freshOrange++;
            }
        }
        
        if(freshOrange == 0) return 0;
        
        int[] rowPoint = {0, 0, -1, 1};
        int[] colPoint = {-1, 1, 0, 0};
        
        int minutes = 0;
        while(!queue.isEmpty()){
            Triple pointer = queue.poll();
            
            for(int i=0; i<4; i++){
                int row = pointer.row + rowPoint[i];
                int col = pointer.col + colPoint[i];
                
                if(row>=0 && row<m && col>=0 && col<n && !visited[row][col] && grid[row][col] == 1){
                    freshOrange--;
                    int mint = pointer.min+1;
                    visited[row][col] = true;
                    queue.add(new Triple(row, col, mint));
                    minutes = mint;
                }
            }
        }
        
        if(freshOrange > 0) return -1;
        
        return minutes;
    }
}
public class Triple{
    int row;
    int col;
    int min;
    public Triple(int row, int col, int min){
        this.row = row;
        this.col = col;
        this.min = min;
    }
}
    