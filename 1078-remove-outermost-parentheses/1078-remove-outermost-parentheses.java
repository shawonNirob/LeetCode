class Solution {
    public String removeOuterParentheses(String s) {
        String str = "";
        int opened = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c=='('){
                if(opened>0) str += c;
                opened++;
            }

            if(c==')'){
                if(opened>1) str +=c;
                opened--;
            }
        }
        return str;

    }
}