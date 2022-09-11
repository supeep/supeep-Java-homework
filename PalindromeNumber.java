class Solution {
    public boolean PN(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int y = x;
        int revertedNumber = 0;
        while (x > 0) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return y == revertedNumber;
    }
}

public class PalindromeNumber {

    public static void main(String[] args) {
        Solution st = new Solution();
        int a = 1234321;
        int b = 54321;
        System.out.println("a:" + st.PN(a));
        System.out.println("b:" + st.PN(b));
    }
}