import java.util.Stack;

public class leetcode25 {
    public static void main(String[] args) {

    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        for (int i = 0; i < k - 1; i++) {
            head = head.next;
        }
        while(temp != null) {
            temp = reverse(temp, k);
            for (int i = 0; i < k; i++) {
                temp = temp.next;
                if (temp == null) {
                    return head;
                }
            }
        }
        return head;
    }
    public static ListNode reverse(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newhead = new ListNode();
        Stack<ListNode> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            if (head == null) {
                return newhead;
            }
            stack.push(head);
            head = head.next;
        }
        newhead = stack.pop();
        ListNode resulthead = newhead;
        while (!stack.isEmpty()) {
            newhead.next = stack.pop();
            newhead = newhead.next;
        }
        newhead.next = head;
        return resulthead;
    }
}
