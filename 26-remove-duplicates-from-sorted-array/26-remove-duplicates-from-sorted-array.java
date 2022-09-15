class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0, pointer= 0;
        while(index < nums.length){
            if(nums[pointer] != nums[index]){
                pointer++;
                nums[pointer] = nums[index];
            }else{
                index++;
            }
        }
        return pointer+1;
    }
}