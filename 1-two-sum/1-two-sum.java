class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            int n = target - nums[i];
            if(map.containsKey(n) && map.get(n) != i){
                return new int[] {i, map.get(n)};
            }else{
                map.put(nums[i], i);
            }
        }
        return null;
    }
}