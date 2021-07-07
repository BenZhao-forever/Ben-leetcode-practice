import java.util.HashSet;
import java.util.Stack;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/4
 * Project: Ben-leetcode-practice
 */
public class leetcode1190 {
    public static void main(String[] args) {

    }
    public static String reverseParentheses(String s) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> right = new Stack<>();
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < r && s.charAt(l) != '(') {
                l++;
            }
            while (l < r && s.charAt(r) != ')') {
                r--;
            }
            if (l < r) {
                left.push(l);
                right.push(r);
                l++;
                r--;
            }
        }
        while (!left.isEmpty()) {
            s = reverse(left.pop(), right.pop(), s);
        }
        s = s.replace(")","");
        s = s.replace("(","");
        return s;
    }

    public static String reverse(int l, int r, String s) {
        if (r - l == 2) {
            return s;
        }
        String left = "";
        String right = "";
        String middle = "";
        if (l != 0) {
            left = s.substring(0, l);
        }
        if (r != s.length() - 1) {
            right = s.substring(r + 1);
        }
        if (l != r - 1) {
            middle = new StringBuilder(s.substring(l, r + 1)).reverse().toString();
        }
        return left + middle + right;
    }
}
