class Solution {
    public String baseNeg2(int n) {
        if(n==0) return "0";
        
        StringBuilder str = new StringBuilder();
        while(n != 0){
            int r = n%(-2);
            n /= (-2);
            
            if(r<0){
                r += 2;
                n += 1;
            }
            str.append(r);
        }
        
        str.reverse();
        
        return str.toString();
        
    }
}