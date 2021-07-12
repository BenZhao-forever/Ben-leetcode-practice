import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
public class leetcode234 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/palindrome-linked-list/", 234);
    }
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = new ListNode();
        slow.next = head;
        ListNode fast = slow;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reverse = reverseList(slow.next);
        while (reverse != null) {
            if (reverse.val != head.val) {
                return false;
            }
            reverse = reverse.next;
            head = head.next;
        }
        return true;
    }
    public static ListNode reverseList(ListNode l1) {
        if (l1 == null || l1.next == null) {
            return l1;
        }
        ListNode pre = null;
        ListNode cur = l1;
        ListNode next = cur.next;
        while (next != null) {
            cur.next = pre;
            pre = cur;
            cur = next;
            next = next.next;
        }
        cur.next = pre;
        return cur;
    }

}
