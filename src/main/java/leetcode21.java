/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/11
 * Project: Ben-leetcode-practice
 */
public class leetcode21 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/merge-two-sorted-lists/", 21);
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode ans = new ListNode();
        ListNode temp = ans;
        while (l1 != null && l2 !=null) {
            if (l1.val > l2.val) {
                temp.next = l2;
                l2 = l2.next;
            }else {
                temp.next = l1;
                l1 = l1.next;
            }
            temp = temp.next;
        }
        if (l1 == null) {
            temp.next = l2;
        }
        if (l2 == null) {
            temp.next = l1;
        }
        return ans.next;
    }
}
