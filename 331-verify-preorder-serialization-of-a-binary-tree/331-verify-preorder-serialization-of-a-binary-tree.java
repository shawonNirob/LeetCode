class Solution {
    public boolean isValidSerialization(String preorder) {
        int slot=1;
        int n = preorder.length();
        for(int i=0; i<n; i++){
            if(preorder.charAt(i) == ',') i++;
            if(--slot < 0) return false;
            if(preorder.charAt(i) != '#'){
                slot += 2;
            }
            while(i<n && preorder.charAt(i) != ',') i++;
        }
        return slot == 0;
    }
}