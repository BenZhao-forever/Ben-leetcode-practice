/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/20
 * Project: Ben-leetcode-practice
 */
public class leetcode160 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/intersection-of-two-linked-lists/", 160);
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode A = headA;
        ListNode B = headB;
        while (A != null || B != null) {
            if (A == null) {
                A = headB;
            }
            if (B == null) {
                B = headA;
            }
            if (A == B) {
                return A;
            }
            A = A.next;
            B = B.next;
        }
        return null;
    }
}
