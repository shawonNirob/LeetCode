class Solution {
    List<List<Integer>> list = new ArrayList();
    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<Integer> l = new LinkedList();
        int n = nums.length;
        helper(0, nums, l, n);
        return list;
    }
    public void helper(int index, int[] nums, LinkedList<Integer> l, int n){
        if(index >= n){
            list.add(new LinkedList<>(l));
            return;
        }
        l.add(nums[index]);
        helper(index+1, nums, l, n);
        l.removeLast();
        helper(index+1, nums, l, n);
    }
}