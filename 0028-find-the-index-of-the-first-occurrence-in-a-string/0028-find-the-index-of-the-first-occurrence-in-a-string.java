class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;

        int n1 = haystack.length();
        int n2 = needle.length();

        int[] lps = kmpArray(needle);

        int p = 0;
        int c = 0;

        int startIndex = 0;

        while(p < n1){
            if(haystack.charAt(p) == needle.charAt(c)){
                p++;
                c++;
                if(c == n2) return p-c;
            }else{
                if(c > 0){
                    c = lps[c-1];
                }else{
                    p++;
                }
            }
        }

        return -1;
    }
    public int[] kmpArray(String needle){
        int n = needle.length();
        int[] lps = new int[n];

        int len = 0;
        int i = 1;

        while(i < n){
            if(needle.charAt(i) == needle.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len != 0){
                    len = lps[len - 1];
                }else{
                    lps[len] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}