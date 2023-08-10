class Solution{
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList();
        for(int i=0; i<nums.length; i++){
            if(i==0 || nums[i] != nums[i-1]){
                twoSum(i, nums, list);
            }
        }
        return list;
    }
    public void twoSum(int i, int[] nums, List<List<Integer>> list){
        int low = i+1, high = nums.length-1;
        
        while(low<high){
            int sum = nums[i]+nums[low]+nums[high];
            if(sum==0){
                list.add(Arrays.asList(nums[i], nums[low++], nums[high--]));
                while(low<high && nums[low] == nums[low-1]){
                    low++;
                }
            }else if(sum>0){
                high--;
            }else{
                low++;
            }
        }
    }
}