//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList < String > ans = new ArrayList < > ();
        int[][] visit = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                visit[i][j] = 0;
            }
        }
        int[] rowArr = {1,0,0,-1};
        int[] colArr = {0,-1,1,0};
        if(m[0][0]==1) helper(0,0,visit,m,n,ans,"", rowArr, colArr);
        return ans;
        
    }
    public void helper(int row, int col,int[][] visit, int[][] m, int n, ArrayList<String> ans, String str, int[] rowArr, int[] colArr){
        if(row==n-1 && col==n-1){
            ans.add(str);
            return;
        }
        
        String s = "DLRU";
        for(int i=0; i<4; i++){
            int r = row + rowArr[i];
            int c = col + colArr[i];
            
            if(r>=0 && c >=0 && r<n && c<n && visit[r][c]==0 && m[r][c]==1){
                visit[row][col]=1;
                helper(r, c, visit, m, n, ans, str+s.charAt(i), rowArr, colArr);
                visit[row][col]=0;
            }
        }
    }
}




