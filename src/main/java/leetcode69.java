/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
public class leetcode69 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/sqrtx/", 69);
    }
    public static int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }
        int left = 0;
        int right = x / 2 + 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid == x) {
                return mid;
            }else if ((long) mid * mid < x) {
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return right - 1;
    }
}
