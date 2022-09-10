class Solution {
    public int missingNumber(int[] nums){
        //For example, given an input int[] nums = [3, 0, 1] which has a length of 3. The value of an int[] with length should be : 0~2. However, because of the missing element 2, there is an extra element 3 which equals nums.length takes place 2's position. Only when xor all element in nums and its index including nums.length, you can finally come up with the missing element: 3^0^1^0^1^2^3 = 2
        
        int ans = nums.length;
        for(int i=0; i<nums.length; i++){
            ans = ans ^ i ^ nums[i];
        }
        return ans;
    }
}