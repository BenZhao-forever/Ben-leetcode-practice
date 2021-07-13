/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/13
 * Project: Ben-leetcode-practice
 */
public class leetcode67 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/add-binary/", 67);
    }
    public static String addBinary(String a, String b) {
        if (a.length() == 0) {
            return b;
        }
        if (b.length() == 0) {
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        int pointera = a.length() - 1;
        int pointerb = b.length() - 1;
        while (pointera >= 0 || pointerb >= 0) {
            int statea = 0;
            int stateb = 0;
            if (pointera >= 0) {
                statea = Character.getNumericValue(a.charAt(pointera));
            }
            if (pointerb >= 0) {
                stateb = Character.getNumericValue(b.charAt(pointerb));
            }
            int sum = statea + stateb + count;
            if (sum >= 2) {
                count = 1;
                sum %= 2;
            }else {
                count = 0;
            }
            stringBuilder.append(sum);
            pointera--;
            pointerb--;
        }
        if (count == 1) {
            stringBuilder.append('1');
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}

