class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack();
        stack.push(0);

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stack.push(0);
            }

            if(s.charAt(i)==')'){
                int inner = stack.pop();
                int outer = stack.pop();

                int score = outer + Math.max(2 * inner, 1);
                stack.push(score);
            }
        }
        return stack.pop();
    }
}