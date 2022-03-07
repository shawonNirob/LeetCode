class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int[] result = new int[n+1];
        while(n>0){
            if(digits[n-1]==9){
                digits[n-1]=0;
                result[0]=1;
                n--;
            }else{
                digits[n-1]+=1;
                return digits;
            }
            
        }
        
        return result;
    }
}