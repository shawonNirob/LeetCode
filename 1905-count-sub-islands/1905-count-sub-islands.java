class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid1.length;
        int n = grid1[0].length;
        int[] r = new int[]{1,-1,0,0};
        int[] c = new int[]{0,0,-1,1};
        boolean[][] isVisited = new boolean[m][n];
        
        int result = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(isVisited[i][j] || grid2[i][j]==0){
                    continue;
                }

                 Stack<int[]> stack = new Stack();
                 stack.push(new int[]{i,j});
                 isVisited[i][j]=true;
                 boolean flag = true;

                 while(!stack.isEmpty()){
                    int node[] = stack.pop();

                     if(grid1[node[0]][node[1]]==0) flag = false;

                     for(int k=0; k<4; k++){
                            int row = r[k]+node[0]; int col = c[k]+node[1];


                            if(row>=0 && row<m && col>=0 && col<n && !isVisited[row][col] && grid2[row][col]==1){
                                isVisited[row][col] = true;
                                stack.push(new int[]{row, col});
                            }
                        }
                    }
                 if(flag) ++result;
            }
        }
        return result;
    }
}