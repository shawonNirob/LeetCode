class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] counts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;  // Increment count for `s`
            counts[t.charAt(i) - 'a']--;  // Decrement count for `t`
        }
        
        for(int check : counts){
            if(check != 0) return false;
        }

        return true;
    }
}