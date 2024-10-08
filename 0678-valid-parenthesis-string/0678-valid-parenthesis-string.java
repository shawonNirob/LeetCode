class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();

        int leftOpen = 0;
        int rightClose = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i)=='*' || s.charAt(i)=='(') leftOpen++;
            else leftOpen--;

            if(leftOpen<0) return false;


            int j = n-1-i;
            if(s.charAt(j)=='*' || s.charAt(j)==')') rightClose++;
            else rightClose--;

            if(rightClose<0) return false;
        }
        return true;
    }
}