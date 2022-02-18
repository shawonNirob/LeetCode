class Solution {
    public boolean isSameAfterReversals(int num) {
            int count = 2, r;
            int number = num;
            while (count > 0) {

                int sum=0;
                while (num > 0) {
                    r = num % 10;
                    sum = sum*10+r;
                    num=num/10;
                }
                num=sum;
                count--;
            }
            if (number == num) {
                return true;
            }
            return false;
        }
}
