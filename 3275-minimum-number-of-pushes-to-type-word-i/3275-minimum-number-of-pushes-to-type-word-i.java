class Solution {
    public int minimumPushes(String word) {
        int number = word.length() / 8;
        int other = word.length() % 8;

        int minimum = 0;
        for(int i=1; i<=number; i++){
            minimum += 8 * i;
        }

        return minimum + (other * (number+1));
    }
}