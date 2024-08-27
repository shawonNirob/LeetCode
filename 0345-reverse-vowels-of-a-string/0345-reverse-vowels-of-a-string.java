class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        StringBuilder str = new StringBuilder(s);
        int i=0;
        int j=str.length()-1;
        while(i<j){
            char left = str.charAt(i);
            char right = str.charAt(j);
            
            if(!vowels.contains(left)){
                i++;
            }else if(!vowels.contains(right)){
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

//The loop runs approximately n/2 times
//Times O(n)
//Space O(n)
