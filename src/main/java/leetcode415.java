/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
public class leetcode415 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/add-strings/", 415);
    }
    public static String addStrings(String num1, String num2) {
        StringBuilder stringBuilder= new StringBuilder(num1);
        int count = 0;
        stringBuilder.reverse();
        num1 = stringBuilder.toString();
        stringBuilder = new StringBuilder(num2);
        stringBuilder.reverse();
        num2 = stringBuilder.toString();
        int i = 0;
        stringBuilder = new StringBuilder();
        while (i < num1.length() || i < num2.length()) {
            int n1 = 0;
            int n2 = 0;
            if (i < num1.length()) {
                n1 = Character.getNumericValue(num1.charAt(i));
            }
            if (i < num2.length()) {
                n2 = Character.getNumericValue(num2.charAt(i));
            }
            int sum = count + n1 + n2;
            if (sum >= 10) {
                count = 1;
                sum %= 10;
            }else {
                count = 0;
            }
            stringBuilder.append(Integer.toString(sum));
            i++;
        }
        if (count == 1) {
            stringBuilder.append(Integer.toString(1));
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
