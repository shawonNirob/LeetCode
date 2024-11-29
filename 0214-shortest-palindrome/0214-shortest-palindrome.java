class Solution {
    public String shortestPalindrome(String s) {
        int n = s.length();
        if(n == 0) return "";

        String temp = s + '#' + new StringBuilder(s).reverse().toString();
        int lps[] = kmp(temp);

        int lpsLength = lps[temp.length() - 1];
        String nonpaliondrome = new StringBuilder(s.substring(lpsLength)).reverse().toString();

        return nonpaliondrome + s;
    }
    public int[] kmp(String s){
        int n = s.length();
        int[] lps = new int[n];

        int len = 0;
        int i = 1;

        while(i < n){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len != 0){
                    len = lps[len - 1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}