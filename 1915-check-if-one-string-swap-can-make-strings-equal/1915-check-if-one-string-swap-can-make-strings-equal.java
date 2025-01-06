class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;

        int mismatchPositionOne = 0;
        int mismatchPositionTwo = 0;
        int mismatch = 0;

        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                mismatch++;
                if(mismatch == 1){
                    mismatchPositionOne = i;
                }else if(mismatch == 2){
                    mismatchPositionTwo = i;
                }else{
                    return false;
                }
            }
        }

        return s1.charAt(mismatchPositionOne) == s2.charAt(mismatchPositionTwo) && s1.charAt(mismatchPositionTwo) == s2.charAt(mismatchPositionOne);

    }
}