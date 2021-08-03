/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/13
 * Project: Ben-leetcode-practice
 */
public class leetcode28 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/implement-strstr/", 28);
    }
//    public static int strStr(String haystack, String needle) {
//        if (needle.length() == 0) {
//            return 0;
//        }
//        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
//            if (haystack.charAt(i) == needle.charAt(0)) {
//                if (needle.equals(haystack.substring(i, i + needle.length()))) {
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int[] next = makeNext(needle);
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = next[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length()) {
                return i - needle.length() + 1;
            }
        }
        return -1;
    }
    public static int[] makeNext(String needle) {
        int[] next = new int[needle.length()];
        next[0] = 0;
        int j = 0;
        for (int i = 1; i < needle.length(); i++) {
            while (j > 0 && needle.charAt(i) != needle.charAt(j)) {
                j = next[j - 1];
            }
            if (needle.charAt(i) == needle.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
