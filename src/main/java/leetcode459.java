import java.util.Arrays;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/8/3
 * Project: Ben-leetcode-practice
 */
public class leetcode459 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/repeated-substring-pattern/", 459);
    }
    public static boolean repeatedSubstringPattern(String s) {
        return kmp(s + s, s);
    }

    public static boolean kmp(String query, String pattern) {
        int n = query.length();
        int m = pattern.length();
        int[] fail = new int[m];
        Arrays.fill(fail, -1);
        for (int i = 1; i < m; ++i) {
            int j = fail[i - 1];
            while (j != -1 && pattern.charAt(j + 1) != pattern.charAt(i)) {
                j = fail[j];
            }
            if (pattern.charAt(j + 1) == pattern.charAt(i)) {
                fail[i] = j + 1;
            }
        }
        int match = -1;
        for (int i = 1; i < n - 1; ++i) {
            while (match != -1 && pattern.charAt(match + 1) != query.charAt(i)) {
                match = fail[match];
            }
            if (pattern.charAt(match + 1) == query.charAt(i)) {
                ++match;
                if (match == m - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
