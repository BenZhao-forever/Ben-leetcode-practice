import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/11
 * Project: Ben-leetcode-practice
 */
class leetcode203Test {

    @Test
    void removeElements() {
        int[] list1 = {1, 2, 6, 3, 4, 5, 6};
        int[] list2 = {};
        int[] list3 = {7, 7, 7, 7};
        int[] ans1 = {1, 2, 3, 4, 5};
        int[] ans2 = {};
        ListNode l1 = ListNode.create(list1);
        ListNode l2 = ListNode.create(list2);
        ListNode l3 = ListNode.create(list3);
        ListNode a1 = ListNode.create(ans1);
        ListNode a2 = ListNode.create(ans2);
        assertEquals(a1.toString(), leetcode203.removeElements(l1, 6).toString());
        assertNull(leetcode203.removeElements(l2, 6));
        assertNull(leetcode203.removeElements(l3, 7));
    }
}