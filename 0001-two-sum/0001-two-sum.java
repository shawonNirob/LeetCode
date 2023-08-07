class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        
        int n = nums.length;
        for(int i=0; i<n; i++){
            int m = target - nums[i];
            if(map.containsKey(m)){
                return new int[] {map.get(m), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return null;
    }
}