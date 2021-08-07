import com.sun.jdi.ClassType;

public class leetcode392 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/is-subsequence/submissions/", 392);
    }
    public static boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] map = new int[m + 1][26];
        for (int i = 0; i < 26; i++) {
            map[m][i] = m;
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                if (t.charAt(i) == j + 'a') {
                    map[i][j] = i;
                }else {
                    map[i][j] = map[i + 1][j];
                }
            }
        }
        int add = 0;
        for (int i = 0; i < n; i++) {
            if (map[add][s.charAt(i) - 'a'] == m) {
                return false;
            }
            add = map[add][s.charAt(i) - 'a'] + 1;
        }
        return true;
    }
}
