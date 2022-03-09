class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry=0;
        
        int p = num1.length() - 1;
        int q = num2.length() - 1;
        
        int x = 0;
        int y = 0;
        
        while(p>=0 || q>=0){
            if(p>=0){
                x = num1.charAt(p) - '0';
            }else{
                x = 0;
            }
            
            if(q>=0){
                y = num2.charAt(q) - '0';
            }else{
                y = 0;
            }
            int sum = x + y + carry;
            result.append(sum%10);
            carry=sum/10;
            
            p--;
            q--;
        }
        if(carry!=0){
            result.append(carry);
        }
       
        StringBuilder ans =  result.reverse();  
        return ans.toString();
    }
}