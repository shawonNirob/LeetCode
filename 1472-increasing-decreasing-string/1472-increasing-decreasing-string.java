class Solution {
    public String sortString(String s) {
        // Step 1: Count the frequency of each character
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        StringBuilder result = new StringBuilder();
        int n = s.length();
        
        // Step 2: Repeat until the result string length matches the input string
        while (result.length() < n) {
            // Ascending order
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    result.append((char) (i + 'a'));
                    freq[i]--;
                }
            }
            
            // Descending order
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    result.append((char) (i + 'a'));
                    freq[i]--;
                }
            }
        }
        
        return result.toString();
    }
}