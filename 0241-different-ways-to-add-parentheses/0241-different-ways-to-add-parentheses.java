class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> list = new ArrayList();

        for(int i=0;i<expression.length(); i++){
            char chr = expression.charAt(i);
            if(chr == '+' || chr == '-' || chr == '*'){
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1));

                for(int l: left){
                    for(int r: right){
                        int val = 0;
                        switch(chr){
                            case '+':
                                val = l + r;
                                break;
                            case '-':
                                val = l - r;
                                break;
                            case '*':
                                val = l * r;
                                break;
                        }
                        list.add(val);
                    }
                }
            }
        }
        if(list.isEmpty()){
            list.add(Integer.parseInt(expression));
        }

        return list;
    }
}