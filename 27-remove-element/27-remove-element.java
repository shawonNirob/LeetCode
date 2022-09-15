class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0, pointer = nums.length;
        while(index < pointer){
            if(nums[index] == val){
                nums[index] = nums[ pointer-1];
                pointer--;
            }else{
                index++;
            }
        }
        return pointer;
    }
}