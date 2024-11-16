class Solution {
    public boolean divisorGame(int n) {
        if(n==1) return false;
        if(n==2) return true;
        if(n==3) return false;

        if(n % 2 == 0) return true;
        else return false;
    }
}