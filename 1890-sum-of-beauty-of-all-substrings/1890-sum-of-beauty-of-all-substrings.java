class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int totalBeauty = 0;

        for(int i=0; i<n; i++){

            int[] store = new int[26];
            for(int j=i; j<n; j++){
                char chr = s.charAt(j);

                store[chr - 'a']++;

                int high = 0;
                int low = Integer.MAX_VALUE;

                for(int freq : store){
                    if(freq > 0){
                        high = Math.max(freq, high);
                        low = Math.min(freq, low);
                    }
                }

                totalBeauty += high - low;
            }
        }

        return totalBeauty;
    }
}