class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int index = 0;
        while(index <= s.length()/2){
            if(s.charAt(index) != s.charAt(s.length()-1-index)){
                return false;
            }
            index++;
        }
        return true;
    }
}