class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcolor = image[sr][sc];
        if(oldcolor != color) dfs(oldcolor, color, sr, sc, image, image.length, image[0].length);
        return image;
    }
    public void dfs(int oldcolor, int color, int row, int col, int[][] image, int m, int n){
        //if(row < 0 || col < 0 || row >= m || col >= n || image[row][col] != oldcolor) return;
        image[row][col] = color;
            
        //downward
        if(row+1 < m && image[row+1][col]==oldcolor) dfs(oldcolor,color,row+1,col,image,m,n);
        //upward
        if(row-1 >= 0 && image[row-1][col]==oldcolor) dfs(oldcolor,color,row-1,col,image,m,n);
        //right
        if(col+1 < n && image[row][col+1]==oldcolor) dfs(oldcolor,color,row,col+1,image,m,n);
        //left
        if(col-1 >= 0 && image[row][col-1]==oldcolor) dfs(oldcolor,color,row,col-1,image,m,n);
    }
}