class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList();

        if(digits.length()==0) return list;

        String[] letter = new String[10];
        
        letter[2] = "abc";
        letter[3] = "def";
        letter[4] = "ghi";
        letter[5] = "jkl";
        letter[6] = "mno";
        letter[7] = "pqrs";
        letter[8] = "tuv";
        letter[9] = "wxyz";

        callCombinations(0, letter, digits, list, "");

        return list;

    }
    public void callCombinations(int digitsIndex, String[] letter, String digits, List<String> list, String s){
        if(s.length()==digits.length()){
            list.add(s);
            return;
        }
        if(digitsIndex >= digits.length()) return;

        char lIndex = digits.charAt(digitsIndex);
        int letterIndex =lIndex - '0';
        String str = letter[letterIndex];
        for(int i=0; i<str.length(); i++){
            callCombinations(digitsIndex+1, letter, digits, list, s+str.charAt(i));
        }
    }
}