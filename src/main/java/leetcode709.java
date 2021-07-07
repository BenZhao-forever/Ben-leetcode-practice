/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/7
 * Project: Ben-leetcode-practice
 */
public class leetcode709 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/to-lower-case/", 709);
    }
    public static String toLowerCase(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                stringBuilder.append((Character.toLowerCase(s.charAt(i))));
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
