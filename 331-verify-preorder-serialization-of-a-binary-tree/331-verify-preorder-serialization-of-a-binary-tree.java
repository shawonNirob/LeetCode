class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] arr = preorder.split(",");
        int slot=1;
        for(String index : arr){
            if(--slot<0) return false;
            if(!index.equals("#")){
                slot += 2;
            }
        }
        return slot == 0;
    }
}