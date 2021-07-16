/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/15
 * Project: Ben-leetcode-practice
 */
public class leetcode1461 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/", 1461);
    }
    public static boolean hasAllCodes(String s, int k) {
        if (k > s.length()) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < k; i++) {
            count = count * 2 + (Character.getNumericValue(s.charAt(i)));
        }
        boolean[] map = new boolean[(int) Math.pow(2.0, k)];
        map[count] = true;
        for (int i = k; i < s.length(); i++) {
            count -= Math.pow(2, k - 1) * Character.getNumericValue(s.charAt(i - k));
            count = count * 2 + (Character.getNumericValue(s.charAt(i)));
            map[count] = true;
        }
        for (boolean n: map) {
            if (!n) {
                return false;
            }
        }
        return true;
    }
}
