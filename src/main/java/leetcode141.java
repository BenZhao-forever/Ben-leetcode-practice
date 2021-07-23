import java.util.HashSet;
import java.util.Set;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/22
 * Project: Ben-leetcode-practice
 */
public class leetcode141 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/linked-list-cycle/", 141);
    }
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        Set<ListNode> hashSet = new HashSet<>();
        while (head != null) {
            if (hashSet.contains(head)) {
                return true;
            }
            hashSet.add(head);
            head = head.next;
        }
        return true;
    }
}
