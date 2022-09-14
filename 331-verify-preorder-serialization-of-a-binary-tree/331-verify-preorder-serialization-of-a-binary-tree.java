class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] arr = preorder.split(",");
        int index=0, slot=1;
        while(index < arr.length){
            if(--slot<0) return false;
            if(!arr[index].equals("#")){
                slot += 2;
            }
            index += 1;
        }
        return slot == 0;
    }
}