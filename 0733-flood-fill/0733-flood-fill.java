class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcolor = image[sr][sc];
        int rowArr[] = {1,0,0,-1};
        int colArr[] = {0,-1,1,0};
        if(oldcolor != color) dfs(rowArr, colArr, oldcolor, color, sr, sc, image, image.length, image[0].length);
        return image;
    }
    public void dfs(int rowArr[], int colArr[], int oldcolor, int color, int row, int col, int[][] image, int m, int n){
        image[row][col] = color;
        
        for(int i=0; i<4; i++){
            int rowN = row + rowArr[i];
            int colN = col + colArr[i];
            if(rowN >= 0 && rowN < m && colN >= 0 && colN < n && image[rowN][colN]==oldcolor){
                dfs(rowArr, colArr, oldcolor,color,rowN, colN ,image,m,n);
            }
        }
    }
}