import java.util.Stack;

public class leetcode227 {
    public static void main(String[] args) {

    }
    public static int calculate (String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }else if (s.charAt(i) != ' ') {
                if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                    stack.push(sb.toString());
                    stack.push(Character.toString(s.charAt(i)));
                    sb = new StringBuilder();
                }else {
                    int number1 = Integer.parseInt(sb.toString());
                    sb = new StringBuilder();
                    char token = s.charAt(i);
                     do {
                        i++;
                        if (i >= s.length()) {
                            break;
                        }
                        if (Character.isDigit(s.charAt(i))) {
                            sb.append(s.charAt(i));
                        }
                    }while (s.charAt(i) == ' ' || Character.isDigit(s.charAt(i)));
                    int number2 = Integer.parseInt(sb.toString());
                    int ans = 0;
                    if (token == '*') {
                        ans = number2 * number1;
                    }else {
                        ans = number1 / number2;
                    }
                    sb = new StringBuilder();
                    stack.push(Integer.toString(ans));
                }
            }
        }
        if (sb.length() != 0) {
            stack.push(sb.toString());
        }
        while (stack.size() != 1) {
            int number1 = Integer.parseInt(stack.pop());
            if (stack.pop().equals("+")) {
                int number2 = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(number1 + number2));
            }else {
                int number2 = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(number2 + -number1));
            }
        }
        return Integer.parseInt(stack.peek());
    }
}
