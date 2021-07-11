/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/11
 * Project: Ben-leetcode-practice
 */
public class leetcode83 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/remove-duplicates-from-sorted-list/", 83);
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = pre.next;
        while (cur != null) {
            if (cur.val == pre.val) {
                pre.next = cur.next;
            }else {
                pre = pre.next;
            }
            cur = cur.next;
        }
        return head;
    }
}
