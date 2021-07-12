/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
public class leetcode86 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/partition-list/", 86);
    }
    public static ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode answer = new ListNode();
        answer.next = head;
        ListNode temphead = head;
        ListNode end = new ListNode();
        ListNode pre = answer;
        ListNode tempend = end;
        while (temphead != null) {
            if (temphead.val >= x) {
                tempend.next = new ListNode(temphead.val);
                tempend = tempend.next;
                pre.next = temphead.next;
            }else {
                pre = pre.next;
            }
            temphead = temphead.next;
        }
        pre.next = end.next;
        return answer.next;
    }
}
