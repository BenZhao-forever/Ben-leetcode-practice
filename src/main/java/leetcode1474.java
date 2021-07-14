/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/14
 * Project: Ben-leetcode-practice
 */
public class leetcode1474 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/", 1474);
    }
    public static ListNode deleteNodes(ListNode head, int m, int n) {
        if (head == null || m * n == 0) {
            return head;
        }
        ListNode temphead = head;
        ListNode pointera = temphead;
        ListNode pointerb;
        int pointer = 1;
        while (head.next != null) {
            if (pointer % (m + n) == m) {
                pointera = head;
            }
            if (pointer % (m + n) == 0) {
                pointerb = head;
                pointera.next = pointerb.next;
            }
            pointer++;
            head = head.next;
        }
        if (pointer % (m + n) > m || pointer % (m + n) == 0) {
            pointera.next = null;
        }
        return temphead;
    }
}
