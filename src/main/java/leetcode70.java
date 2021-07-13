/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
public class leetcode70 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/climbing-stairs/", 70);
    }
    public static int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        int a = 0;
        int b = 1;
        int c = 2;
        for (int i = 2; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }
}
