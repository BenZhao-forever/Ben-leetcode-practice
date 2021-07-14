import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/14
 * Project: Ben-leetcode-practice
 */
class leetcode1474Test {

    @Test
    void deleteNodes() {
        int[] list1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] list2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] list3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] list4 = {9, 3, 7, 7, 9, 10, 8, 2};
        int[] ans1 = {1, 2, 6, 7, 11, 12};
        int[] ans2 = {1, 5, 9};
        int[] ans3 = {1, 2, 3, 5, 6, 7, 9, 10, 11};
        int[] ans4 = {9, 7, 8};
        int[] list5 = {4, 1, 4, 6, 1, 6, 8, 2, 10, 2, 8, 10};
        int[] ans5 = {4, 6, 8, 2};
        ListNode l1 = ListNode.create(list1);
        ListNode l2 = ListNode.create(list2);
        ListNode l3 = ListNode.create(list3);
        ListNode l4 = ListNode.create(list4);
        ListNode a1 = ListNode.create(ans1);
        ListNode a2 = ListNode.create(ans2);
        ListNode a3 = ListNode.create(ans3);
        ListNode a4 = ListNode.create(ans4);
        ListNode l5 = ListNode.create(list5);
        ListNode a5 = ListNode.create(ans5);
        assertEquals(a1.toString(), leetcode1474.deleteNodes(l1, 2, 3).toString());
        assertEquals(a2.toString(), leetcode1474.deleteNodes(l2, 1, 3).toString());
        assertEquals(a3.toString(), leetcode1474.deleteNodes(l3, 3, 1).toString());
        assertEquals(a4.toString(), leetcode1474.deleteNodes(l4, 1, 2).toString());
        assertEquals(a5.toString(), leetcode1474.deleteNodes(l5, 1, 2).toString());
    }
}