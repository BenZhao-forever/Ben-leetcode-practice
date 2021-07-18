/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/17
 * Project: Ben-leetcode-practice
 */
public class leetcode844 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/backspace-string-compare/", 844);
    }
    public static boolean backspaceCompare(String s, String t) {
        return removeBackspace(s).equals(removeBackspace(t));
    }
    public static String removeBackspace(String s) {
        StringBuilder sb = new StringBuilder();
        int backspace = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                backspace++;
            }else {
                if (backspace == 0) {
                    sb.append(s.charAt(i));
                }else {
                    backspace--;
                }
            }
        }
        return sb.toString();
    }
}
