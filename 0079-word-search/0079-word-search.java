class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                boolean[][] visited = new boolean[m][n];
                if(board[i][j]==word.charAt(0) && dfs(0, i, j , visited, board, word, m, n)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean dfs(int str, int r, int c, boolean[][] visited, char[][] board, String word, int m, int n){
        if(str==word.length()) return true;
        
        if(r<0 || r>=m || c<0 || c>=n || visited[r][c] || board[r][c]!=word.charAt(str)) return false;
        
        visited[r][c] = true;
        
        int[] rp = {0, 0, -1, 1};
        int[] cp = {-1, 1, 0, 0};
        
        for(int i=0; i<4; i++){
            int row = r+rp[i];
            int col = c+cp[i];
            
            if(dfs(str+1, row, col, visited, board, word, m, n)){
                return true;
            }
        }
        visited[r][c] = false;
        
        return false;
    }
}