class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<ops.length; i++){
            if(ops[i].equals("C")){
                stack.pop();
            }else if(ops[i].equals("D")){
                stack.push(stack.peek()*2);
            }else if(ops[i].equals("+")){
                int n1 = stack.pop();
                int n2 = n1 + stack.peek();
                stack.push(n1);
                stack.push(n2);
            }else{
                stack.push(Integer.parseInt(ops[i]));
            }
        }
        int sum = 0;
        for(int i: stack){
            sum += i;
        }
      
        return sum;
    }
}