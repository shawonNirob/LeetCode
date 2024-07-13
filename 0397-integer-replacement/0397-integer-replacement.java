class Solution {
    Map<Long, Integer> map = new HashMap();
    public int integerReplacement(int n) {
        return findMin(n);
    }
    public int findMin(long n){
        if(n==1) return 0;
        if(map.containsKey(n)) return map.get(n);
        
        if(n%2==0){
            int step = 1+findMin(n/2);
            map.put(n, step);
            return step;
        }else{
            int opt1 = 1+findMin(n+1);
            int opt2 = 1+findMin(n-1);
            int step = Math.min(opt1, opt2);
            map.put(n, step);
            return step;
        }
    }
}