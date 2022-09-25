class Solution {
    public boolean judgeSquareSum(int c) {
        double val = Math.sqrt(c);
        int sqrtC = (int)val;

        
        for(int a=0; a<=sqrtC; a++){
            double p = c - a*a;
            double value = Math.sqrt(p);
            int b = (int)value;
            if(a*a + b*b == c) return true;
        }
        return false;
    }
}