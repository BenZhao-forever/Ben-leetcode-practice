import java.util.Stack;

public class leetcode232 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/implement-queue-using-stacks/", 232);
    }
}
class MyQueue {
    private  Stack<Integer> stack1;
    private  Stack<Integer> stack2;
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void push(int x) {
        stack1.push(x);
    }
    public int pop() {
        if (!stack2.empty()) {
            return stack2.pop();
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
    public int peek() {
        if (!stack2.empty()) {
            return stack2.peek();
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }
    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }
}
