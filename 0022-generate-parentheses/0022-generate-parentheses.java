class Solution{
    public List<String> generateParenthesis(int n){

        List<String> list = new ArrayList();
        callParenthesis(list, 1 , 0, n, "(");

        return list;
    }
    public void callParenthesis(List<String> list, int open, int close, int n, String str){
        if(open+close == n*2){
            list.add(str);
            return;
        }

        if(open < n){
            callParenthesis(list, open+1, close, n, str+"(");
        }

        if(close < open){
            callParenthesis(list, open, close+1, n, str+")");
        }
    }
}