class Solution {
    public static boolean isPalindrome(int x) {
        int temp = x, rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if (rev == temp) {
            return true;
        } else {
            return false;
        }
    }
}