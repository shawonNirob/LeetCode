class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (count == 0) {
                    start = i;
                }
                count++;
            } else if (target != nums[i] && count > 0) {
                break;
            }
        }
        if (count > 0) {
            return new int[]{start, start + count - 1};
        } else {
            return new int[]{-1, -1};
        }
    }
}