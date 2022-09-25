class Solution {
    public boolean judgeSquareSum(int c) {
        double val = Math.sqrt(c);
        int sqrtC = (int)val;

        
        for(int a=0; a<=sqrtC; a++){
            double b = Math.sqrt(c - a*a);
            if(b == (int)b) return true;
        }
        return false;
    }
}