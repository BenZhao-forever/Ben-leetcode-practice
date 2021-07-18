/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/17
 * Project: Ben-leetcode-practice
 */
public class leetcode397 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/integer-replacement/", 397);
    }
    public static long integerReplace(long n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return integerReplace(n / 2) + 1;
        }else {
            return Math.min(integerReplace(n - 1), integerReplace(n + 1)) + 1;
        }
    }
    public static int integerReplacement(int n) {
        return (int)integerReplace(n);
    }
}
