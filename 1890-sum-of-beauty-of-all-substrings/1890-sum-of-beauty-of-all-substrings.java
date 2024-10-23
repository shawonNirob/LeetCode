class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int totalBeauty = 0;

        for(int i=0; i<n; i++){

            Map<Character, Integer> map = new HashMap();
            for(int j=i; j<n; j++){
                char chr = s.charAt(j);

                map.put(chr, map.getOrDefault(chr, 0) + 1);

                int high = Integer.MIN_VALUE;
                int low = Integer.MAX_VALUE;

                for(int freq : map.values()){
                    high = Math.max(freq, high);
                    low = Math.min(freq, low);
                }

                totalBeauty += high - low;
            }
        }

        return totalBeauty;
    }
}