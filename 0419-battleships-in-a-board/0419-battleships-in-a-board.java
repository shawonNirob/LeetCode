class Solution {
    public int countBattleships(char[][] board) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        int res = 0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(!visited[i][j] && board[i][j]=='X'){
                    res += 1;
                    dfs(i,j,visited,board);
                }
            }
        }
        return res;
    }
    public void dfs(int r, int c, boolean[][] visited, char[][] board){
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c]!='X' || visited[r][c]) return;
        
        visited[r][c] = true;
        
        dfs(r+1,c,visited,board);
        dfs(r-1,c,visited,board);
        dfs(r,c+1,visited,board);
        dfs(r,c-1,visited,board);
        
    }
}