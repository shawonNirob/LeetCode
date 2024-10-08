class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder str = new StringBuilder();
        int n = s.length();

        int leftOpen = 0;
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(c =='(') leftOpen++;
            if(c ==')') {
                if(leftOpen == 0) continue;
                leftOpen--;
            }
            str.append(c);
        }

        StringBuilder result = new StringBuilder();
        n = str.length();
        leftOpen = 0;
        for(int j=n-1; j>=0; j--){
            char c = str.charAt(j);
            if(c ==')') leftOpen++;
            if(c =='(') {
                if(leftOpen==0) continue;
                leftOpen--;
            }
            result.append(c);
        }

        return result.reverse().toString();
    }
}