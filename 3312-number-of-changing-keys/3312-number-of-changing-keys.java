class Solution {
    public int countKeyChanges(String s) {
        int key = 0;
        String str = s.toUpperCase();
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i-1) != str.charAt(i)){
                key++;
            }
        }
        return key;
    }
}