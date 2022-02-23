class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1;
        int i=0;
        int minNum =nums[i];
        while(i<nums.length-1){
            if(nums[i+1]-minNum!=0 && nums[i+1]-minNum > max){
                max = nums[i+1]-minNum;
            }
            if(nums[i+1]<minNum){
                minNum=nums[i+1];
            }
            i++;
        }
        return max;
    }
}