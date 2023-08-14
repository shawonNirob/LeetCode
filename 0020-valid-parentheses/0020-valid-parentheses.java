class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        
        for(int i=0; i<s.length(); i++){
            char chr = s.charAt(i);
                
            if(chr == '(' ) stack.push(')');
            else if(chr == '{' ) stack.push('}');
            else if(chr == '[' ) stack.push(']');
            else if(stack.isEmpty() || stack.pop() != chr) return false; 
        }
        return stack.isEmpty();
    }
}