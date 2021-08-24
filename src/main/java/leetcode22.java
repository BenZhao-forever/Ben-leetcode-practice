import java.util.ArrayList;
import java.util.List;

public class leetcode22 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/generate-parentheses/", 22);
    }
//    public static List<String> generateParenthesis(int n) {
//        List<String> answer = new ArrayList<>();
//        backtrack(answer, new StringBuilder(), 0, 0, n);
//        return answer;
//    }
//    public static void backtrack(List<String> answer, StringBuilder sb, int left, int right, int n) {
//        if (sb.length() == n * 2) {
//            answer.add(sb.toString());
//            return;
//        }
//        if (left < n) {
//            sb.append('(');
//            backtrack(answer, sb, left + 1, right, n);
//            sb.deleteCharAt(sb.length() - 1);
//        }
//        if (right < left) {
//            sb.append(')');
//            backtrack(answer, sb, left, right + 1, n);
//            sb.deleteCharAt(sb.length() - 1);
//        }
//    }

    private static final List<String> list = new ArrayList<>();
    public static List<String> generateParenthesis(int n) {

        dfs(n, 0, 0, "");
        return list;
    }

    //left is nums of '('
    public static void dfs(int n, int left, int right, String s) {
        if (right == n) {
            list.add(s);
            return;
        }
        if (left < n) {
            dfs(n, left + 1, right, s + "(");
            s = s.substring(0,s.length() - 1);
        }
        if (left > right) {
            dfs(n, left, right + 1, s + ")");
        }
    }
}

