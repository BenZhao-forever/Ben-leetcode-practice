import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/15
 * Project: Ben-leetcode-practice
 */
public class leetcode1408 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/string-matching-in-an-array/", 1408);
    }
    public static List<String> stringMatching(String[] words) {
        List<String> answer = new ArrayList<>();
        if (words.length < 2) {
            return answer;
        }
        Arrays.sort(words, Comparator.comparingInt(String::length));
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isSubstring(words[j], words[i])) {
                    answer.add(words[i]);
                    break;
                }
            }
        }
        return answer;
    }
    public static boolean isSubstring(String l, String s) {
        for (int i = 0; i < l.length() - s.length() + 1; i++) {
            if (l.startsWith(s, i)) {
                return true;
            }
        }
        return false;
    }
}
