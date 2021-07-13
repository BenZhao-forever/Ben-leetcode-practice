/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
public class leetcode147 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/insertion-sort-list/", 147);
    }
    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temphead = new ListNode();
        temphead.next = head;
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode next = cur.next;
        while (next != null) {
            if (cur.val < pre.val) {
                pre.next = next;
                insert(temphead, next, cur);
            } else {
                pre = cur;
            }
            cur = next;
            next = next.next;
        }
        if (cur.val < pre.val) {
            pre.next = next;
            insert(temphead, next, cur);
        }
        return temphead.next;
    }
    public static void insert(ListNode start, ListNode end, ListNode sert) {
        ListNode pre = start;
        ListNode cur = start.next;
        while (cur != end) {
            if (cur.val > sert.val) {
                pre.next = sert;
                sert.next = cur;
                break;
            }
            cur = cur.next;
            pre = pre.next;
        }
    }
}
