class Solution {
    public void sortColors(int[] nums) {
        int red=0, white=0, blue = nums.length-1;
        
        while(white <= blue && red < nums.length){
            if(nums[white]==0){
                swap(nums, white, red);
                red++;
                white++;
            }
            else if(nums[white] == 1){
                white++;
            }
            else if(nums[white] == 2){
                swap(nums, white, blue);
                blue--;
            }
        }
    }
    public void swap(int[] nums, int n1, int n2){
        int temp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = temp;
    }
}