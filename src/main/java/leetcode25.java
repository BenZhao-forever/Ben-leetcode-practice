import java.util.Stack;

public class leetcode25 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/reverse-nodes-in-k-group/", 25);
    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || head == null || head.next == null) {
            return head;
        }
        ListNode pre = new ListNode();
        pre.next = head;
        ListNode back = head;
        ListNode[] mid;
        ListNode temphead = pre;
        while (back != null) {
            for (int i = 0; i < k - 1; i++) {
                back = back.next;
                if (back == null) {
                    return temphead.next;
                }
            }
            ListNode next = back.next;
            mid = reverse(pre.next, back);
            pre.next = mid[0];
            mid[1].next = next;
            back = next;
            for (int i = 0; i < k; i++) {
                pre = pre.next;
                if (pre == null) {
                    return temphead.next;
                }
            }
        }
        return temphead.next;
    }
    public static ListNode[] reverse(ListNode front, ListNode back) {
        back.next = null;
        ListNode temphead = front;
        ListNode pre = null;
        ListNode cur = front;
        ListNode next = cur.next;
        while (next != null) {
            cur.next = pre;
            pre = cur;
            cur = next;
            next = next.next;
        }
        cur.next = pre;
        return new ListNode[] {cur, temphead};
    }
}
