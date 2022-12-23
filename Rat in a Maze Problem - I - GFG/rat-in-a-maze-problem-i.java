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
        if(m[0][0]==1) helper(0,0,visit,m,n,ans,"");
        return ans;
        
    }
    public void helper(int row, int col,int[][] visit, int[][] m, int n, ArrayList<String> ans, String str){
        if(row==n-1 && col==n-1){
            ans.add(str);
            return;
        }
        
        //Downward
        if(row+1<n && visit[row+1][col]==0 && m[row+1][col]==1){
            visit[row][col] = 1;
            helper(row+1,col,visit,m,n,ans,str+'D');
            visit[row][col] = 0;
        }
        
        //Left
        if(col-1>=0 && visit[row][col-1]==0 && m[row][col-1]==1){
            visit[row][col] = 1;
            helper(row,col-1,visit,m,n,ans,str+'L');
            visit[row][col] = 0;
        }
        
        //Right
        if(col+1<n && visit[row][col+1]==0 && m[row][col+1]==1){
            visit[row][col] = 1;
            helper(row,col+1,visit,m,n,ans,str+'R');
            visit[row][col] = 0;
        }
        
        //Up
        if(row-1>=0 && visit[row-1][col]==0 && m[row-1][col]==1){
            visit[row][col] = 1;
            helper(row-1,col,visit,m,n,ans,str+'U');
            visit[row][col] = 0;
        }
    }
}