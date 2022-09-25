class Solution {
    public boolean judgeSquareSum(int c){
        double val = Math.sqrt(c);
        int sqrtC = (int)val;

        for(int a=0; a<=sqrtC; a++){
            int b = c - a*a;
            if(binarySearch(b, a, sqrtC)) return true;
        }
        return false;
    }
    public boolean binarySearch(int b, int left, int right){
        while(left <= right){
            int mid = left + (right-left)/2;
            if(mid * mid == b) return true;
            else if(mid * mid > b) right = mid -1;
            else left = mid + 1;
        }
        return false;
    }
}