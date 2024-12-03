class Solution {
    public int repeatedStringMatch(String a, String b) {
        int repeatCount = (b.length() + a.length() - 1) / a.length(); 
        StringBuilder repeatedA = new StringBuilder(a.repeat(repeatCount));
        
        if (repeatedA.toString().contains(b)) {
            return repeatCount;
        }

        repeatedA.append(a);
        if (repeatedA.toString().contains(b)) {
            return repeatCount + 1;
        }
        
        return -1;
    }
}