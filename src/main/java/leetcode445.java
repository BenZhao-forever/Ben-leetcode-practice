import java.util.Stack;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/11
 * Project: Ben-leetcode-practice
 */
public class leetcode445 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/add-two-numbers-ii/", 445);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        int count = 0;
        ListNode ans = null;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int val1 = 0;
            int val2 = 0;
            if (!stack1.isEmpty()) {
                val1 = stack1.pop();
            }
            if (!stack2.isEmpty()) {
                val2 = stack2.pop();
            }
            int sum = val1 + val2 + count;
            if (sum >= 10) {
                count = 1;
                sum %= 10;
            }else {
                count = 0;
            }
            ListNode temp = new ListNode(sum);
            temp.next = ans;
            ans = temp;
        }
        if (count == 1) {
            ListNode temp = new ListNode(1);
            temp.next = ans;
            ans = temp;
        }
        return ans;
    }
}
