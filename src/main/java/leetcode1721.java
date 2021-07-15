/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/15
 * Project: Ben-leetcode-practice
 */
public class leetcode1721 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/swapping-nodes-in-a-linked-list/", 1721);
    }
    public static ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temphead = new ListNode();
        temphead.next = head;
        ListNode fast = temphead;
        for (int i = 0; i < k - 1; i++) {
            fast = fast.next;
        }
        ListNode leftpre = fast;
        ListNode left = fast.next;
        ListNode leftnext = fast.next.next;
        ListNode slow = temphead;
        fast = fast.next.next;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode rightpre = slow;
        ListNode right = slow.next;
        ListNode rightnext = slow.next.next;
        if (left == right) {
            return head;
        }
        if (rightpre == left) {
            leftpre.next = right;
            right.next = left;
            left.next = rightnext;
        }else if(leftpre == right) {
            rightpre.next = left;
            left.next = right;
            right.next = leftnext;
        } else {
            leftpre.next = right;
            right.next = leftnext;
            rightpre.next = left;
            left.next = rightnext;
        }
        return temphead.next;
    }
}
