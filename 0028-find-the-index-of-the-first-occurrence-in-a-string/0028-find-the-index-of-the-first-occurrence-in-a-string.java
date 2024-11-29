class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) return -1;

        int n1 = haystack.length();
        int n2 = needle.length();

        int startIndex = 0;

        int p = 0;
        int c = 0;

        while(p < n1){
            if(haystack.charAt(p) == needle.charAt(c)){
                p++;
                c++;
                if(c == n2) return startIndex;

            }else{
                c = 0;
                p = startIndex + 1;
                startIndex = p;
            }
        }
        
        return -1;
    }
}