/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/4
 * Project: Ben-leetcode-practice
 */
public class leetcode82 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/", 82);
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fakehead = new ListNode();
        fakehead.next = head;
        ListNode pre = fakehead;
        ListNode cur = head;
        ListNode next = head.next;
        while(next != null) {
            if (cur.val != next.val) {
                next = next.next;
                cur = cur.next;
                pre = pre.next;
            }else {
                while (next != null && next.val == cur.val) {
                    next = next.next;
                }
                pre.next = next;
                cur = next;
                if (cur == null) {
                    break;
                }
                next = cur.next;
            }
        }
        return fakehead.next;
    }
}
