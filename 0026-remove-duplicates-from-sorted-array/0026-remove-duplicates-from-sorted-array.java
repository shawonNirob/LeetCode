class Solution {
    public int removeDuplicates(int[] nums) {
        int index=0, pointer = 0;
         while(pointer<nums.length){
             if(nums[index] != nums[pointer]){
                 index++;
                 nums[index] = nums[pointer];
             }else{
                 pointer++;
             }
         }
        return index+1;
    }
}