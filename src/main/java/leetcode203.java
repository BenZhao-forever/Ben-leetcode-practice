/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/11
 * Project: Ben-leetcode-practice
 */
public class leetcode203 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/remove-linked-list-elements/", 203);
    }
    /*public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode pre = new ListNode();
        ListNode temphead = pre;
        pre.next = head;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            }else {
                pre = pre.next;
            }
            cur = cur.next;
        }
        return temphead.next;
    }*/

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode temphead = new ListNode();
        temphead.next = head;
        ListNode pre = temphead;
        while (head != null) {
            if (head.val == val) {
                pre.next = head.next;
            }else {
                pre = pre.next;
            }
            head = head.next;
        }
        return temphead.next;
    }
}
