/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/19
 * Project: Ben-leetcode-practice
 */
public class leetcode1100 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/find-k-length-substrings-with-no-repeated-characters/", 1100);
    }
    public static int numKLenSubstrNoRepeats(String s, int k) {
        if (k > s.length()) {
            return 0;
        }
        if (k == 1) {
            return s.length();
        }
        int answer = 0;
        int[] map = new int[26];
        int left = 0;
        map[s.charAt(left) - 'a']++;
        for (int i = 1; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
            if (map[s.charAt(i) - 'a'] != 1) {
                while (s.charAt(left) != s.charAt(i)) {
                    map[s.charAt(left) - 'a']--;
                    left++;
                }
                map[s.charAt(left) - 'a']--;
                left++;
            }
            if (i - left == k - 1) {
                answer++;
                map[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return answer;
    }
}
