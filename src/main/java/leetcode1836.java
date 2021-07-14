import java.util.HashMap;
import java.util.HashSet;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/14
 * Project: Ben-leetcode-practice
 */
public class leetcode1836 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/remove-duplicates-from-an-unsorted-linked-list/", 1836);
    }
    public static ListNode deleteDuplicatesUnsorted(ListNode head) {
        HashMap<Integer, Integer> set = new HashMap<>();
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temphead = new ListNode();
        temphead.next = head;
        while (head != null) {
            if (set.containsKey(head.val)) {
                set.put(head.val, set.get(head.val) + 1);
            }else {
                set.put(head.val, 1);
            }
            head = head.next;
        }
        head = temphead.next;
        ListNode pre = temphead;
        while (head.next != null) {
            if (set.get(head.val) > 1) {
                pre.next = head.next;
            }else {
                pre = pre.next;
            }
            head = head.next;
        }
        if (set.get(head.val) > 1) {
            pre.next = null;
        }
        return temphead.next;
    }
}
