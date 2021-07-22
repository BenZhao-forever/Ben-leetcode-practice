import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/22
 * Project: Ben-leetcode-practice
 */
public class leetcode438 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/find-all-anagrams-in-a-string/", 438);
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (p.length() > s.length()) {
            return list;
        }
        int[] map = new int[26];
        for (char c: p.toCharArray()) {
            map[c - 'a']++;
        }
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            int[] temp = Arrays.copyOf(map, 26);
            if (map[s.charAt(i) - 'a'] != 0 && isAnagram(s.substring(i, i + p.length()), temp)) {
                list.add(i);
            }
        }
        return list;
    }
    public static boolean isAnagram(String s, int[] map) {
        for (char c: s.toCharArray()) {
            if(map[c - 'a']-- == 0) {
                return false;
            }
        }
        return true;
    }
}
