class Solution {
    public String reverseOnlyLetters(String s) {
        Set<Character> aschii = new HashSet();
        for(int i=65; i<=90; i++){
            aschii.add((char) i);
        }
        for(int i=97; i<=122; i++){
            aschii.add((char) i);
        }
        
        StringBuilder str = new StringBuilder(s);
        
        int i = 0;
        int j = str.length()-1;
        
        while(i<j){
            char left = str.charAt(i);
            char right = str.charAt(j);
            if(!aschii.contains(left)){
                i++;
            }else if(!aschii.contains(right)){
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