class Solution {
    public int minCut(String s) {
        int[] minCuts = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            minCuts[i] = i;
        }
        for (int i = 0; i < s.length(); i++) {
            expandAroundCenter(s, i, i, minCuts);
            expandAroundCenter(s, i, i + 1, minCuts);
        }
        return minCuts[s.length() - 1];
    }

    private void expandAroundCenter(String s, int left, int right, int[] minCuts) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            if (left == 0) {
                minCuts[right] = 0;
            } else {
                minCuts[right] = Math.min(minCuts[right], minCuts[left - 1] + 1);
            }
            left--;
            right++;
        }
    }
}
