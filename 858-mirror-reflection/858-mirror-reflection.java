class Solution {
    public int mirrorReflection(int p, int q) {
        int m,n;
        m = n = 1;
        while(m*p != n*q){
            n++;
            m = n*q /p;
        }
        if(m % 2 == 1  &&  n % 2 == 1) return 1;
        if(m % 2 == 1  &&  n % 2 == 0) return 2;
        if(m % 2 == 0  &&  n % 2 == 1) return 0;
        
        return -1;
    }
}