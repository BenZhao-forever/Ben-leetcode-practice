import java.util.Stack;

public class leetcode150 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/evaluate-reverse-polish-notation/", 150);
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (Character.isDigit(token.charAt(0)) || token.length() >= 2) {
                stack.push(Integer.valueOf(token));
            }else {
                int answer = 0;
                int number1 = stack.pop();
                int number2 = stack.pop();
                switch (token) {
                    case "+" :
                        answer = number1 + number2;
                        break;
                    case "-" :
                        answer = number2 - number1;
                        break;
                    case "*" :
                        answer = number1 * number2;
                        break;
                    case "/" :
                        answer = number2 / number1;
                        break;
                }
                stack.push(answer);
            }
        }
        return stack.peek();
    }
}
