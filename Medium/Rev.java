class Solution {
    public int reverse(int num) {
        if(num==0){
            return 0;
        }
       return b(num, 0);}
        private int b(int num, int result) {
            if (num == 0) {
            return result;
        }
        int x = num % 10;
        if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && x > 7)) {
            return 0;
        }
        if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && x < -8)) {
            return 0;
        }
        return b(num / 10, (result * 10) + x);

    }
}