class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0, pointer= 0;
        while(index < nums.length){
            while(index < nums.length && nums[pointer] == nums[index]){
                index++;
            }
            if(index < nums.length){
                pointer++;
                nums[pointer] = nums[index];                
            }
        }
        return pointer+1;
    }
}