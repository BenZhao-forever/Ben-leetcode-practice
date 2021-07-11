import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/11
 * Project: Ben-leetcode-practice
 */
class leetcode19Test {

    @Test
    void removeNthFromEnd() {
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = {1};
        int[] list3 = {1, 2};
        int[] ans1 = {1, 2, 3, 5};
        int[] ans2 = {1};
        ListNode l1 = ListNode.create(list1);
        ListNode l2 = ListNode.create(list2);
        ListNode l3 = ListNode.create(list3);
        ListNode a1 = ListNode.create(ans1);
        ListNode a2 = ListNode.create(ans2);
        assertEquals(a1.toString(), leetcode19.removeNthFromEnd(l1, 2).toString());
        assertNull(leetcode19.removeNthFromEnd(l2, 1));
        assertEquals(a2.toString(), leetcode19.removeNthFromEnd(l3, 1).toString());
    }
}