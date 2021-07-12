/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/11
 * Project: Ben-leetcode-practice
 */
public class leetcode61 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/rotate-list/", 61);
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode temphead = new ListNode();
        temphead.next = head;
        for (int i = 0; i < k; i++) {
            head = head.next;
            if (head == null) {
                head = temphead.next;
            }
        }
        if (head == temphead.next) {
            return temphead.next;
        }
        ListNode front = temphead.next;
        while (head.next != null) {
            head = head.next;
            front = front.next;
        }
        ListNode back = front.next;
        front.next = null;
        head.next = temphead.next;
        return back;
    }
}
