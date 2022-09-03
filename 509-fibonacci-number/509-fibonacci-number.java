class Solution {
    Map<Integer, Integer> map;
    public int fib(int n) {
        map = new HashMap();
        
        return dpFib(n);
        
    }
    private int dpFib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(map.containsKey(n)) return map.get(n);
        
        map.put(n, dpFib(n-1) + dpFib(n-2));
        
        return map.get(n);
    }
}