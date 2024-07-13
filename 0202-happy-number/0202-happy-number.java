class Solution {
    
    Set<Integer> set = new HashSet();
    
    public boolean isHappy(int n) {
        if(n==1) return true;
        if(set.contains(n)){
            return false;
        }
        set.add(n);
        
        int m = degitSquareSum(n);
        
        return isHappy(m);
        
    }
    public int degitSquareSum(int n){
        int sum = 0;
        while(n>0){
            int d = n%10;
            n = n/10;
            sum += d*d;
        }
        return sum;
    }
}