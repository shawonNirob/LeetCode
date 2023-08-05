//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.binary_to_decimal(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int binary_to_decimal(String str) {
        // Code here
        int l = str.length();
        int n = l;
        int deci = 0;
        for(int i=0; i<l; i++){
            int bit = Character.getNumericValue(str.charAt(i));
            
            n--;
            int partSum = bit * (int)Math.pow(2, n);
            deci += partSum;
        }
        
        return deci;
    }
}