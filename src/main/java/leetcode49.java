import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/24
 * Project: Ben-leetcode-practice
 */
public class leetcode49 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/group-anagrams/", 49);
    }
/*    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        if (strs.length == 0) {
            return answer;
        }
        if (strs.length == 1) {
            List<String> level = new ArrayList<>();
            level.add(strs[0]);
            answer.add(level);
            return answer;
        }
        for (int i = 0; i < strs.length; i++) {
            if ("*".equals(strs[i])) {
                continue;
            }
            List<String> level = new ArrayList<>();
            level.add(strs[i]);
            for (int j = i + 1; j < strs.length; j++) {
                if ("*".equals(strs[j])) {
                    continue;
                }
                if (isAnagram(strs[i], strs[j])) {
                    level.add(strs[j]);
                    strs[j] = "*";
                }
            }
            answer.add(level);
        }
        return answer;
    }
    public static boolean isAnagram(String a, String b) {
        if (a.equals(b)) {
            return true;
        }
        if (a.length() != b.length()) {
            return false;
        }
        int[] map = new int[26];
        for (char c: a.toCharArray()) {
            map[c - 'a']++;
        }
        for (char c: b.toCharArray()) {
            if (--map[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }*/
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str: strs) {
            int[] count = new int[26];
            for (char c: str.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    sb.append((char) ('a' + i));
                    sb.append(count[i]);
                }
            }
            String key = sb.toString();
            List<String> level = new ArrayList<>();
            if (map.containsKey(key)) {
                level = map.get(key);
            }
            level.add(str);
            map.put(key, level);
        }
        return new ArrayList<>(map.values());
    }
}
