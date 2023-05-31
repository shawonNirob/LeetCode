class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        Map<Integer, int[]> map = new HashMap<>();
        
        int N = arr.length;
        int m = mat.length;
        int n = mat[0].length;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                map.put(mat[i][j], new int[]{i, j});
            }
        }
        
        int[] row = new int[m];
        int[] col = new int[n];
        
        for(int i=0; i<N; i++){
            int ar[] = map.get(arr[i]);
            
            row[ar[0]]++;
            col[ar[1]]++;
            
            //column height = row number
            //row length = column number
            if(row[ar[0]] == n || col[ar[1]] == m) return i;
        }
        
        return -1;
        
    }
}