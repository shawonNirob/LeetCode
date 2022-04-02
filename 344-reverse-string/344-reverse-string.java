class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right = s.length-1;
        recursive(s, left, right);
    }
    public void recursive(char[] s, int left, int right){
        if(left>=right) return;
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        recursive(s, left+1, right-1);
    }
}