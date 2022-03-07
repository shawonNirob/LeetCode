class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> result= new LinkedList<>();
        int l = num.length-1;
        while(l>=0 || k!=0){
            if(l>=0){
                k+=num[l];
            }
            result.addFirst(k%10);
            k /= 10;
            l--;
        }
        return result;
    }
}