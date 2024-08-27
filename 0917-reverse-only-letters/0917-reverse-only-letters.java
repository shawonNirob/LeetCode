class Solution {
    public String reverseOnlyLetters(String s) {        
        StringBuilder str = new StringBuilder(s);
        
        int i = 0;
        int j = str.length()-1;
        
        while(i<j){
            char left = str.charAt(i);
            char right = str.charAt(j);
            if(!Character.isLetter(left)){
                i++;
            }else if(!Character.isLetter(right)){
                j--;
            }else{
                str.setCharAt(i, right);
                str.setCharAt(j, left);
                i++;
                j--;
            }
        }
        return str.toString();
    }
}