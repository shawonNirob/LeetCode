class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0;
        int opened = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c=='('){
                opened++;
                maxDepth = Math.max(maxDepth, opened);
            }

            if(c==')'){
                opened--;
            }
        }
        return maxDepth;
    }
}