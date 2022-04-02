class Solution {
    public boolean validPalindrome(String s) {
        int i =0, j = s.length()-1;
        
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                if(checkPalindrome(s, i+1, j)){
                    i +=1;
                }
                else if(checkPalindrome(s, i, j-1)){
                    j -=1;
                }else{
                    return false;
                }
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean checkPalindrome(String s, int i, int j){
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            } 
            i++;
            j--;
        }
        return true;
    }
}