/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/6/23
 * Project: Ben-leetcode-practice
 */
public class leetcode2 {
    public static void main(String[] args) {

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode();
        pre.next = l1;
        while (true) {
            l1.val += l2.val;
            if (l1.next == null) {
                l1.next = l2.next;
                break;
            }
            if (l2.next == null) {
                break;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        l1 = pre.next;
        while (l1 != null) {
            if (l1.next == null && l1.val >= 10) {
                l1.val %= 10;
                l1.next = new ListNode(1);
                break;
            }
            if (l1.val >= 10) {
                l1.val %= 10;
                l1.next.val ++;
            }
            l1 = l1.next;
        }
        return pre.next;
    }
}
