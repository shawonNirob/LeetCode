public class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int length = 0; 

  
        for (int i = 1; i < n; i++) {
            while (length > 0 && s.charAt(i) != s.charAt(length)) {
                length = lps[length - 1];
            }
            if (s.charAt(i) == s.charAt(length)) {
                length++;
                lps[i] = length;
            } else {
                lps[i] = 0;
            }
        }


        return s.substring(0, lps[n - 1]);
    }
}