class Solution {
    public int fib(int n) {
        int prev = 0;
        int next = 1;
        int current = prev;
        
        for(int i=2; i<=n; i++){
            current = prev + next;
            
            prev = next;
            next = current;
        }
        
        return n==0 ? current : next;
    }
}