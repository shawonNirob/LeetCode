class Solution{
    public List<String> generateParenthesis(int n){
        StringBuilder str = new StringBuilder();
        str.append('(');

        List<String> list = new ArrayList();
        callParenthesis(list, 1 , 0, n, str);

        return list;
    }
    public void callParenthesis(List<String> list, int open, int close, int n, StringBuilder str){
        if(open+close == n*2 && isValid(str)){
            list.add(str.toString());
            return;
        }

        if(open < n){
            str.append('(');
            callParenthesis(list, open+1, close, n, str);
            str.deleteCharAt(str.length()-1);
        }

        if(close < n){
            str.append(')');
            callParenthesis(list, open, close+1, n, str);
            str.deleteCharAt(str.length()-1);
        }
    }
    public boolean isValid(StringBuilder str){
        int open = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '(') open++;
            if(str.charAt(i) == ')') open--;
            if(open < 0) return false;
        }
        return true;
    }
}