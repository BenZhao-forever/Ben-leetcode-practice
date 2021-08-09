import java.util.Stack;

public class leetcode1047 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/", 1047);
    }
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.empty()) {
                stack.push(s.charAt(i));
            }else {
                if (stack.peek() == s.charAt(i)) {
                    stack.pop();
                }else {
                    stack.push(s.charAt(i));
                }
            }
        }
        StringBuilder string = new StringBuilder();
        while (!stack.empty()) {
            string.insert(0, stack.pop());
        }
        return string.toString();
    }
}
