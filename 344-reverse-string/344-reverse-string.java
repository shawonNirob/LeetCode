class Solution {
    public void reverseString(char[] s) {
        int j = s.length-1;
        for(int i=0; i<s.length; i++){
            if(i>=j) break;
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            
            j--;
        }
    }
}