/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/6/23
 * Project: Ben-leetcode-practice
 */
public class leetcode2 {
    public static void main(String[] args) {

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int count = 0;
        ListNode ans = new ListNode();
        ans.next = l1;
        while (l1 != null || l2 != null) {
            if (l2 == null) {
                l2 = new ListNode(0);
            }
            l1.val = l1.val + l2.val + count;
            if (l1.val >= 10) {
                count = 1;
                l1.val = l1.val % 10;
            }else {
                count = 0;
            }
            if (l1.next == null && l2.next == null && count == 1) {
                l1.next = new ListNode(1);
                break;
            }
            if (l1.next == null && l2.next !=null) {
                l1.next = new ListNode(0);
            }
            l2 = l2.next;
            l1 = l1.next;
        }
        return ans.next;
    }
}
