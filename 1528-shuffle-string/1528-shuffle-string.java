class Solution {
    public String restoreString(String s, int[] indices) {
        char[] chr = new char[indices.length]; 
        String str = "";
        for(int i=0; i<s.length(); i++) {
            chr[indices[i]] = s.charAt(i);
        }
        return new String(chr);
    }
}