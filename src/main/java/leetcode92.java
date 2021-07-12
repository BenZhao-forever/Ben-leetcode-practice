/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/7
 * Project: Ben-leetcode-practice
 */
public class leetcode92 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/reverse-linked-list-ii/", 92);
    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode[] mid;
        ListNode temphead = new ListNode();
        temphead.next = head;
        ListNode start = temphead;
        ListNode end = temphead;
        for (int i = 0; i < left - 1; i++) {
            start = start.next;
        }
        for (int i = 0; i < right; i++) {
            end = end.next;
        }
        ListNode endnext = end.next;
        ListNode tempstart = start;
        mid = reverse(start.next, end);
        tempstart.next = mid[0];
        mid[1].next = endnext;
        return temphead.next;
    }
    public static ListNode[] reverse(ListNode start, ListNode end) {
        if (start == end) {
            end.next = null;
            return new ListNode[] {start, end};
        }
        end.next = null;
        ListNode pre = null;
        ListNode cur = start;
        ListNode next = start.next;
        while (next != null) {
            cur.next = pre;
            pre = cur;
            cur = next;
            next = next.next;
        }
        cur.next = pre;
        return new ListNode[] {cur, start};
    }

}
