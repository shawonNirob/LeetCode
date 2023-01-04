class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] isVisited = new boolean[m][n];
        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                if(row == 0 || col ==0 || row == m-1 || col == n-1){
                    if(!isVisited[row][col] && board[row][col] == 'O'){
                        dfs(row,col,board,isVisited,m,n);
                    }
                }
            }
        }
        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                if(!isVisited[row][col] && board[row][col] == 'O') board[row][col] = 'X';
            }
        }
    }
    
    public void dfs(int row,int col,char[][] board,boolean[][] isVisited,int m,int n){
        if(row<0 || row>=m || col<0 || col>=n || isVisited[row][col] || board[row][col] != 'O') return;
        
        isVisited[row][col] = true;
        
        dfs(row+1,col,board,isVisited,m,n);
        dfs(row-1,col,board,isVisited,m,n);
        dfs(row,col+1,board,isVisited,m,n);
        dfs(row,col-1,board,isVisited,m,n);
    }
}