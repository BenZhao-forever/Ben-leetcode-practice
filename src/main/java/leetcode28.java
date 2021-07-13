/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/13
 * Project: Ben-leetcode-practice
 */
public class leetcode28 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/implement-strstr/", 28);
    }
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (needle.equals(haystack.substring(i, i + needle.length()))) {
                    return i;
                }
            }
        }
        return -1;
    }
}
