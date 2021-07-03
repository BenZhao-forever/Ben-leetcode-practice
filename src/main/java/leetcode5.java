/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/6/27
 * Project: Ben-leetcode-practice
 */
public class leetcode5 {
    public static void main(String[] args) {

    }
    public static String longestPalindrome(String s) {
        String answer = "";
        if (s.length() == 0) {
            return answer;
        }
        answer = "" + s.charAt(0);
        int left;
        int right;
        for (int i = 0; i < s.length() - 1; i++) {
            left = i;
            right = i;
            answer = answer.length() > palindrome(s, left, right).length() ? answer : palindrome(s, left, right);
            if (s.charAt(i) == s.charAt(i + 1)) {
                right++;
            }
            answer = answer.length() > palindrome(s, left, right).length() ? answer : palindrome(s, left, right);
        }
        return answer;
    }
    public static String palindrome(String s, int left, int right) {
        while (s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            if (left < 0 || right >= s.length()) {
                break;
            }
        }
        return s.substring(left + 1, right);
    }
}
