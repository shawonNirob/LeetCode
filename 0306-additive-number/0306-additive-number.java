import java.math.BigInteger;

public class Solution {
    
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; Math.max(i, j) <= n - i - j; j++) {
                if (isValid(i, j, num)) return true;
            }
        }
        return false;
    }
    
    private boolean isValid(int i, int j, String num) {
        if (num.charAt(0) == '0' && i > 1) return false;
        if (num.charAt(i) == '0' && j > 1) return false;
        
        String sum;
        BigInteger b1 = new BigInteger(num.substring(0, i));
        BigInteger b2 = new BigInteger(num.substring(i, i + j));
        
        for (int offset = i + j; offset < num.length(); offset += sum.length()) {
            b2 = b2.add(b1);
            b1 = b2.subtract(b1);
            sum = b2.toString();
            if (!num.startsWith(sum, offset)) return false;
        }
        return true;
    }
}

//112358 additive, 011 addi, 10112 add, 20202 non-add

// 1199200399