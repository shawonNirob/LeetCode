class Solution {
    Map<Long, Integer> map = new HashMap();
    public int integerReplacement(int n) {
        return findMin(n);
    }
    public int findMin(long n){
        if(n==1) return 0;
        if(map.containsKey(n)) return map.get(n);
        
        int step;
        if(n%2==0){
            step = 1 + findMin(n/2);
        }else{
            step = 1 + Math.min(findMin(n+1), findMin(n-1));
        }
        map.put(n, step);
        return step;
    }
}