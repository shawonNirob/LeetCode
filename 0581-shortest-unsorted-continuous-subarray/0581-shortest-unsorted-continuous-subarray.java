class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        
        int start = n;
        int end = n-1;
        
        for(int i=0; i<nums.length; i++){
            if(sorted[i] != nums[i]){
                start = Math.min(start, i);
                end = i;
            }
        }
        
        return end-start+1;
    }
}