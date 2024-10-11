class Solution {
    public int minAddToMakeValid(String s) {
        
        int extra = 0;
        int open = 0;
        for(int i=0; i<s.length(); i++){
            char chr = s.charAt(i);
            if(chr == '(') open++;
            else if(chr == ')' && open > 0) open--;
            else extra++;
        }
        return open + extra;
    }
}