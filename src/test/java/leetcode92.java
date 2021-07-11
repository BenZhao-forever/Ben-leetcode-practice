/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/7
 * Project: Ben-leetcode-practice
 */
public class leetcode92 {
    public static void main(String[] args) {

    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode[] mid = new ListNode[2];
        ListNode start = new ListNode();
        start.next = head;
        ListNode end = head;
        for (int i = 0; i < left - 1; i++) {
            start = start.next;
        }
        for (int i = 0; i < right - 1; i++) {
            end = end.next;
        }
        mid = reverse(start.next, end);
        end = end.next;
        start.next = mid[0];
        mid[1].next = end;
        return head;
    }
    public static ListNode[] reverse(ListNode start, ListNode end) {
        end.next = null;
        ListNode next = start;
        ListNode position = end.next;
        while (next != end) {
            ListNode temp = next.next;
            end.next = next;
            next.next = position;
            next = temp;
            position = end.next;
        }
        return new ListNode[] {end, start};
    }

}
