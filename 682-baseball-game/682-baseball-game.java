class Solution {
    public int calPoints(String[] ops) {
        int j =0;
        int[] op = new int[ops.length];

        for(int i=0; i<ops.length; i++){
            if(ops[i].equals("C")){
                op[j-1] = 0;
                j--;
            }else if(ops[i].equals("D")){
                op[j] = op[j-1]*2;
                j++;
            }else if(ops[i].equals("+")){
                op[j] = op[j-1] + op[j-2];
                j++;
            }else{
                op[j] = Integer.parseInt(ops[i]);
                j++;
            }
        }
        int sum = 0;
        for(int i=0; i<op.length; i++){
            sum += op[i];
        }
      
        return sum;
    }
}