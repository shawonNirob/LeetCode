class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;

        //check identical and duplicate
        if(s.equals(goal)){
            Set<Character> set = new HashSet();
            for(char chr : s.toCharArray()){
                set.add(chr);
            }

            return set.size() < s.length();
        }

        //check the position of two unmatch
        int first = -1; int second = -1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)){
                if(first == -1) first = i;
                else if(second == -1) second = i;
                else return false; //Should not contains more than two miosmatch
            }
        }

        //Check that two can me swapable

        return second != -1 && s.charAt(first) == goal.charAt(second) &&  s.charAt(second) == goal.charAt(first);
    }
}