class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0, ones =0, twos =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0)
                zeros++;
            else if(nums[i]==1)
                ones++;
            else
                twos++;
        }
        for(int i=0; i<nums.length; i++){
            if(i < zeros)
                nums[i] = 0;
            else if(i < zeros+ones)
                nums[i] = 1;
            else
                 nums[i] = 2;
        }
    }
}