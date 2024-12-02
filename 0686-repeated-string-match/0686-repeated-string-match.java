class Solution {
    public int repeatedStringMatch(String a, String b) {
        int repeatCount = (b.length() + a.length() - 1) / a.length(); // Minimum repeats
        StringBuilder repeatedA = new StringBuilder(a.repeat(repeatCount));
        
        // Check if b is a substring of the current repeated string
        if (repeatedA.toString().contains(b)) {
            return repeatCount;
        }

        // Check with one more repetition
        repeatedA.append(a);
        if (repeatedA.toString().contains(b)) {
            return repeatCount + 1;
        }

        // If b is still not found
        return -1;
    }
}