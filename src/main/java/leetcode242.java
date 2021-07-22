/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/22
 * Project: Ben-leetcode-practice
 */
public class leetcode242 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/valid-anagram/", 242);
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (map[t.charAt(i) - 'a']-- == 0) {
                return false;
            }
        }
        return true;
    }
}
