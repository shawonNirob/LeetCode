class Solution{
    public void reverseString(char[] s){
        int i=0;
        int j=s.length-1;
        while(i<j){
            char chr = s[i];
            s[i] = s[j];
            s[j] = chr;
            i++;
            j--;
        }
    }
}