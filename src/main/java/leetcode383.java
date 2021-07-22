/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/22
 * Project: Ben-leetcode-practice
 */
public class leetcode383 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/ransom-note/", 383);
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }
        int[] map = new int[26];
        for (char c: magazine.toCharArray()) {
            map[c - 'a']++;
        }
        for (char c: ransomNote.toCharArray()) {
            if (map[c - 'a']-- == 0) {
                return false;
            }
        }
        return true;
    }
}
