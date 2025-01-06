class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int firstSum = 0;
        for(int i=0; i<firstWord.length(); i++){
            int num = firstWord.charAt(i) - 'a';
            firstSum = firstSum * 10 + num;
        }

        int secondSum = 0;
        for(int i=0; i<secondWord.length(); i++){
            int num = secondWord.charAt(i) - 'a';
            secondSum = secondSum * 10 + num;
        }

        int targetSum = 0;
        for(int i=0; i<targetWord.length(); i++){
            int num = targetWord.charAt(i) - 'a';
            targetSum = targetSum * 10 + num;
        }

        return firstSum + secondSum == targetSum;
    }
}