class Solution {
    public int fib(int n) {
        double goldenRatio = (1 + Math.sqrt(5))/2;
        double fib = Math.round((Math.pow(goldenRatio, n))/Math.sqrt(5));
        
        return (int) fib;
    }
}