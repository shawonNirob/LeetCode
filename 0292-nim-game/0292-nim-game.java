class Solution {
    public boolean canWinNim(int n) {
        if(n==1) return true;
        else if(n==2) return true;
        else if(n==3) return true;
        else if(n%4==0) return false;
        else return true;
    }
}