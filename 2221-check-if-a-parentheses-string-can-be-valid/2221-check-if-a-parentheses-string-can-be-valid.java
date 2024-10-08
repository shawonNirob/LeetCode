class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if(s.length()%2 != 0) return false;

        int leftOpen = 0;
        int rightClose = 0;
        for(int i=0; i<s.length(); i++){
            if(locked.charAt(i) == '0' || s.charAt(i) == '(') leftOpen++;
            else leftOpen--;

            if(leftOpen < 0) return false;


            int j = n-1-i;
            if(locked.charAt(j) == '0' || s.charAt(j) == ')') rightClose++;
            else rightClose--;

            if(rightClose < 0) return false;
        }

        return true;
    }
}