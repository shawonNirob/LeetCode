class Solution {
    public int smallestRangeII(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int res = nums[n-1] - nums[0];
        int left = nums[0]+k; int right = nums[n-1]-k;
        for (int i = 0; i < n - 1; ++i) {
            int max = Math.max(nums[i]+k, right);
            int min = Math.min(left, nums[i+1]-k);
            res = Math.min(res, max-min);
        }
        return res;
    }
}