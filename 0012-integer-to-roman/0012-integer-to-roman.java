class Solution {
    public String intToRoman(int num) {
        // Define the mapping of Roman numerals to integer values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        // Iterate over the values and symbols
        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]); // Append the Roman numeral
                num -= values[i];        // Reduce the number by the value
            }
        }

        return roman.toString(); // Return the constructed Roman numeral
    }
}