import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class leetcode227 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/basic-calculator-ii/", 227);
    }
    public static int calculate(String s) {
        LinkedList<Integer> stackInt = new LinkedList<>();
        LinkedList<Character> stackChar = new LinkedList<>();
        int index = 0;
        while (index < s.length()) {
            if (s.charAt(index) != ' ') {
                int num = 0;
                if (s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                    while (index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
                        num = num * 10 + s.charAt(index) - '0';
                        index++;
                    }

                    if (!stackChar.isEmpty() && (stackChar.peek() == '/' || stackChar.peek() == '*')) {
                        int last = stackInt.pop();
                        if (stackChar.peek() == '/') {
                            num = last / num;
                        }else {
                            num = last * num;
                        }
                        stackChar.pop();
                    }
                    stackInt.push(num);
                    continue;
                }else {
                    stackChar.push(s.charAt(index));
                    index++;
                }
            }else {
                index++;
            }
        }
        int res = stackInt.pollLast();
        while (!stackChar.isEmpty()) {
            char c = stackChar.pollLast();
            int cur = stackInt.pollLast();
            if (c == '+') {
                res += cur;
            }else {
                res -= cur;
            }
        }
        return res;
    }
}
