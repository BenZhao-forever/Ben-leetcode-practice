/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/13
 * Project: Ben-leetcode-practice
 */
public class leetcode58 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/length-of-last-word/", 58);
    }
    public static int lengthOfLastWord(String s) {
        if (s.length() == 0) {
            return 0;
        }
        boolean start = false;
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                start = true;
                count++;
            } else if (start) {
                return count;
            }
        }
        return count;
    }
}
