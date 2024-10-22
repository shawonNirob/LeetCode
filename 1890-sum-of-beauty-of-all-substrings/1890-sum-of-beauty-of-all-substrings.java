public class Solution {
    public int beautySum(String s) {
        int totalBeauty = 0;
        int n = s.length();

        // Iterate through all possible starting points for substrings
        for (int start = 0; start < n; start++) {
            int[] charCount = new int[26]; // To store counts of characters 'a' to 'z'
            for (int end = start; end < n; end++) {
                char currentChar = s.charAt(end);
                charCount[currentChar - 'a']++; // Update the character count

                // Calculate max and min frequency of characters that appear
                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                for (int freq : charCount) {
                    if (freq > 0) { // Only consider characters that appear in the substring
                        if (freq > maxFreq) {
                            maxFreq = freq;
                        }
                        if (freq < minFreq) {
                            minFreq = freq;
                        }
                    }
                }

                // Calculate beauty for the current substring
                totalBeauty += maxFreq - minFreq;
            }
        }

        return totalBeauty; // Return the total beauty of all substrings
    }
}