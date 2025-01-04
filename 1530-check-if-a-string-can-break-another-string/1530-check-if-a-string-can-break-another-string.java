class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean str1 = true;
        boolean str2 = true; 

        for(int i=0; i<arr1.length; i++){
            if(arr1[i] < arr2[i]) str2 = false;

            if(arr2[i] < arr1[i]) str1 =false;

            if(str1==false && str2==false){
                return false;
            }
        }

        return true;
    }
}