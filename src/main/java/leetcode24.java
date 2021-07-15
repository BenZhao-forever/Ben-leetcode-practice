/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/15
 * Project: Ben-leetcode-practice
 */
public class leetcode24 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/swap-nodes-in-pairs/", 24);
    }
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next ==null) {
            return head;
        }
        ListNode temphead = new ListNode();
        temphead.next = head;
        ListNode pre = temphead;
        ListNode swap1 = head;
        ListNode swap2 = head.next;
        ListNode next = swap2.next;
        while (next != null) {
            pre.next = swap2;
            swap2.next = swap1;
            swap1.next = next;
            pre = swap1;
            swap1 = pre.next;
            if (swap1.next == null) {
                return temphead.next;
            }
            swap2 = swap1.next;
            next = swap2.next;
        }
        pre.next = swap2;
        swap2.next = swap1;
        swap1.next = null;
        return temphead.next;
    }
}
