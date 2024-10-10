class Solution {
    public int longestValidParentheses(String s) {
        int maxCount = 0;

        int open = 0;
        int close = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(') open++;
            else close++;

            if(open == close) maxCount = Math.max(maxCount, 2 * open);
            
            if(close > open) open = close = 0;
   
        }

        open = close = 0;

        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == '(') open++;
            else close++;

            if(open == close) maxCount = Math.max(maxCount, 2 * open);
            
            if(open > close) open = close = 0;
        }

        return maxCount;
    }
}