import java.util.HashMap;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/20
 * Project: Ben-leetcode-practice
 */
public class leetcode76 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/minimum-window-substring/", 76);
    }
    public static String minWindow(String s, String t) {
        String answer = s + t;
        if (t.length() > s.length()) {
            return "";
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), map.get(t.charAt(i)) + 1);
            }else {
                map.put(t.charAt(i), 1);
            }
        }
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                while (isValid(map)) {
                    if (i - left + 1 < answer.length()) {
                        answer = s.substring(left, i + 1);
                    }
                    if (map.containsKey(s.charAt(left))) {
                        map.put(s.charAt(left), map.get(s.charAt(left)) + 1);
                    }
                    left++;
                }
            }
        }
        return answer.equals(s + t) ? "" : answer;
    }
    public static boolean isValid(HashMap<Character, Integer> map) {
        for (Integer values: map.values()) {
            if (values > 0) {
                return false;
            }
        }
        return true;
    }
}
