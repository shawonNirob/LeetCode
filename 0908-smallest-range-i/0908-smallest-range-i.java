class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        
        if(min+k >= max -k)
            return 0;
        else{
            return ((max -k) - (min+k));
        }
    }
}