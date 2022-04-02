class Solution {
    public String firstPalindrome(String[] words) {
        String s = "";
        for(int i = 0; i<words.length; i++){
            s = words[i];
            if(checkPalindrome(s)){
                return s;
            }else{
                s = "";
            }
        }
        return s;
    }
    public boolean checkPalindrome(String s){
        int i = 0, j=s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            } 
            i++;
            j--;
        }
        return true;
    }
}