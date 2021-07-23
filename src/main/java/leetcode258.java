/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/19
 * Project: Ben-leetcode-practice
 */
public class leetcode258 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/add-digits/", 258);
    }
/*    public static int addDigit(int num) {
        return (num - 1) % 9 + 1;
    }*/
    public static int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return addDigits(sum);
    }
}
