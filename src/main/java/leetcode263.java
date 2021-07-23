/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/18
 * Project: Ben-leetcode-practice
 */
public class leetcode263 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/ugly-number/", 263);
    }
    /*public static boolean isUgly(int n) {
        if (n < 0) {
            return false;
        }
        if (n <=5 && n != 4) {
            return true;
        }else if (n % 2 == 0){
            return isUgly(n / 2);
        }else if (n % 3 == 0) {
            return isUgly(n / 3);
        }else if (n % 5 == 0) {
            return isUgly(n / 5);
        }else {
            return false;
        }
    }*/
    public static boolean isUgly(int n) {
        for (int i: new int[] {5, 3, 2}) {
            while (n > 0 && n % i == 0) {
                n /= i;
            }
        }
        return n == 1;
    }
}
