/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/11
 * Project: Ben-leetcode-practice
 */
public class leetcode19 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/remove-nth-node-from-end-of-list/", 19);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temphead = new ListNode();
        temphead.next = head;
        ListNode right = head;
        for (int i = 0; i < n; i++) {
            right = right.next;
        }
        ListNode left = head;
        ListNode pre = temphead;
        while (right != null) {
            pre = pre.next;
            left = left.next;
            right = right.next;
        }
        pre.next = left.next;
        return temphead.next;
    }
}
