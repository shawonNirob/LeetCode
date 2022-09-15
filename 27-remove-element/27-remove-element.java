class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0, pointer = 0;
        while(index < nums.length){
            if(nums[index] != val){
                nums[pointer] = nums[index];
                pointer++;
            }
            index++;
        }
        return pointer;
    }
}