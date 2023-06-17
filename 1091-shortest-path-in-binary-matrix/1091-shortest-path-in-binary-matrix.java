class Solution {
    public int shortestPathBinaryMatrix(int[][] grid){
        if(grid[0][0]==1) return -1;
        int n = grid.length;
        boolean[][] distance = new boolean[n][n];
        Queue<Triple> queue = new LinkedList();
        
        queue.add(new Triple(0, 0, 0));
        
        distance[0][0] = true;
        
        int[] rowArr = {-1,-1,-1,0,0,1,1,1};
        int[] colArr = {-1,0,1,-1,1,-1,0,1};
        
        while(!queue.isEmpty()){
            Triple pointer = queue.poll();
            if(pointer.row==n-1 && pointer.col==n-1) return pointer.dist+1;
            
            for(int i=0; i<8; i++){
                int row = pointer.row+rowArr[i];
                int col = pointer.col+colArr[i];
                
                if(row>=0 && row<n && col >=0 && col<n && !distance[row][col] && grid[row][col]==0){
                    distance[row][col] = true;
                    queue.add(new Triple(pointer.dist+1, row, col));
                }
            }
        }
        return -1;
    }
}
class Triple{
    int dist;
    int row;
    int col;
    public Triple(int dist, int row, int col){
        this.dist = dist;
        this.row = row;
        this.col = col;
    }
}