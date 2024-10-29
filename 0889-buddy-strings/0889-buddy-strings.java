import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean buddyStrings(String s, String goal) {
        // Step 1: Check length
        if (s.length() != goal.length()) {
            return false;
        }
        
        // Step 2: Check if s and goal are identical and contain duplicate characters
        if (s.equals(goal)) {
            Set<Character> uniqueChars = new HashSet<>();
            for (char c : s.toCharArray()) {
                uniqueChars.add(c);
            }
            return uniqueChars.size() < s.length(); // True if there's at least one duplicate character
        }
        
        // Step 3: Identify mismatched positions
        int first = -1, second = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false; // More than two mismatches
                }
            }
        }
        
        // Step 4: Ensure two mismatches exist and are swappable
        return second != -1 &&
               s.charAt(first) == goal.charAt(second) &&
               s.charAt(second) == goal.charAt(first);
    }
}
