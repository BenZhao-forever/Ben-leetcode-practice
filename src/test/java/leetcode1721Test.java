import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/15
 * Project: Ben-leetcode-practice
 */
class leetcode1721Test {

    @Test
    void swapNodes() {
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = {7, 9, 6, 6, 7, 8, 3, 0, 9, 5};
        int[] list3 = {1, 2};
        int[] list4 = {1, 2, 3};
        int[] ans1 = {1, 4, 3, 2, 5};
        int[] ans2 = {7, 9, 6, 6, 8, 7, 3, 0, 9, 5};
        int[] ans3 = {2, 1};
        int[] ans4 = {1, 2, 3};
        ListNode l1 = ListNode.create(list1);
        ListNode l2 = ListNode.create(list2);
        ListNode l3 = ListNode.create(list3);
        ListNode l4 = ListNode.create(list4);
        ListNode a1 = ListNode.create(ans1);
        ListNode a2 = ListNode.create(ans2);
        ListNode a3 = ListNode.create(ans3);
        ListNode a4 = ListNode.create(ans4);
        assertEquals(a1.toString(), leetcode1721.swapNodes(l1, 2).toString());
        assertEquals(a2.toString(), leetcode1721.swapNodes(l2, 5).toString());
        assertEquals(a3.toString(), leetcode1721.swapNodes(l3, 1).toString());
        assertEquals(a4.toString(), leetcode1721.swapNodes(l4, 2).toString());
    }
}