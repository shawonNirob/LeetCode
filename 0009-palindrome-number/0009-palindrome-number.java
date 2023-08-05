class Solution {
    public boolean isPalindrome(int x) {
        if(x <  0) return false;
        
        String str = Integer.toString(x);
            
        int n = str.length();
        for(int i=0; i<n; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        
        return true;
    }
}