class Solution {
    public int missingNumber(int[] nums){
        int sum=0, sumOnly=0;
        for(int i=0; i<nums.length; i++){
            sumOnly += nums[i];
            sum += i;
        }
        sum += nums.length;
        return sum - sumOnly;
    }
}