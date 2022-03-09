class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int p =a.length() - 1;
        int q =b.length() - 1;
        
        int carry = 0;
        while(p>=0 || q>=0){
            int x = p>=0 ? a.charAt(p--) - '0': 0;
            int y = q>=0 ? b.charAt(q--) - '0': 0;
            int sum= x +y +carry;
            carry = sum>1 ? 1 : 0;
            result.append(sum%2);
        }
        if(carry!=0){
            result.append(carry);
        }
        StringBuilder ans = result.reverse();
        
        return ans.toString();
    }
}