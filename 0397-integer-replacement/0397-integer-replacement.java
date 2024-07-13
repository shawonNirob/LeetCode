class Solution {
    public int integerReplacement(int n) {
        return findMin(n);
    }
    public int findMin(long n){
        if(n==1) return 0;
        
        if(n%2==0){
            return 1+findMin(n/2);
        }else{
            int opt1 = 1+findMin(n+1);
            int opt2 = 1+findMin(n-1);
            return Math.min(opt1, opt2);
        }
    }
}