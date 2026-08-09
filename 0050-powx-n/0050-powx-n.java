class Solution {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if(n < 0) {
            if(n == Integer.MIN_VALUE) {
                return 1 / (x * myPow(x, -(n+1)));
            }
            return 1/myPow(x, -n);
        }

        if(n%2==0) {
            double half = myPow(x, n/2);
            return half * half;
        } else {
            double half = myPow(x, n/2);
            return x * half * half;
        }
    }
}