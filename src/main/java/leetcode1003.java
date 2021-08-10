import java.util.Stack;

public class leetcode1003 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/check-if-word-is-valid-after-substitutions/", 1003);
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            }else if (s.charAt(i) == 'c') {
                if (stack.peek() == 'b') {
                    stack.pop();
                    if(stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek() == 'a') {
                        stack.pop();
                    }else {
                        stack.push('b');
                        stack.push(s.charAt(i));
                    }
                }else {
                    stack.push(s.charAt(i));
                }
            }else {
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }
}
