/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/23
 * Project: Ben-leetcode-practice
 */
public class leetcode29 {
    public static void main(String[] args) {

    }
    public static int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (divisor == 1) {
            return dividend;
        }
        if (divisor == -1) {
            if (dividend > Integer.MIN_VALUE) {
                return -dividend;
            }
            return Integer.MAX_VALUE;
        }
        long a = dividend;
        long b = divisor;
        int sign = 1;
        if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
            sign = -1;
        }
        a = a > 0 ? a : -a;
        b = b > 0 ? b : -b;
        long answer = div(a, b);
        if (sign > 0) {
            return Math.toIntExact(answer > Integer.MAX_VALUE ? Integer.MAX_VALUE : answer);
        }
        return Math.toIntExact(-answer);
    }
    public static long div(long a, long b) {
        if (a < b) {
            return 0;
        }
        long count = 1;
        long tb = b;
        while((tb + tb) <= a) {
            count = count + count;
            tb = tb + tb;
        }
        return count + div(a-tb, b);
    }
}
