class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int n = nums.length;
        
        int sum = max;
        for(int i=1; i<n; i++){
            sum += nums[i];
            if(nums[i] > sum){
                sum = nums[i];
            }
            max = Math.max(sum, max);
        }
        
        return max;
    }
}