/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/15
 * Project: Ben-leetcode-practice
 */
public class jianzhi18 {
    public static void main(String[] args) {
        readMeSet.addJianZhi("https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/", 18);
    }
    public static ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode temphead = new ListNode();
        temphead.next = head;
        ListNode pre = temphead;
        while (head != null) {
            if (head.val == val) {
                pre.next = head.next;
            }
            pre = pre.next;
            head = head.next;
        }
        return temphead.next;
    }
}
