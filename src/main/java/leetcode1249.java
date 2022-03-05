import java.util.HashSet;

public class leetcode1249 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/",1249);
    }
    public static String minRemoveToMakeValid(String s) {
        HashSet<Integer> left = new HashSet<>();
        HashSet<Integer> right = new HashSet<>();
        int lr = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                lr++;
            }
            if (s.charAt(i) == ')') {
                if (lr == 0) {
                    left.add(i);
                }else {
                    lr--;
                }
            }
        }
        lr = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ')') {
                lr++;
            }
            if (s.charAt(i) == '(') {
                if (lr == 0) {
                    right.add(i);
                }else {
                    lr--;
                }
            }
        }
        //HashSet<Integer> min = left.size() > right.size() && left.size() != 0 ? left : right;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!(left.contains(i) || right.contains(i))) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
