class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
		if(n < 3) return 0;
		
        int res = 0;
        int dp =0;
        
        for(int i=2; i<n; i++){
            if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2]){
                dp++;
            }else{
                dp=0;
            }
            res += dp;
        }
		return res;
    }
}