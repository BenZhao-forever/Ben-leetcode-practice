import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
class leetcode23Test {

    @Test
    void mergeTwoLists() {
        int[] list1 = {1, 2, 4};
        int[] list2 = {1, 3, 4};
        int[] ans1 = {1, 1, 2 ,3, 4, 4};
        ListNode l1 = ListNode.create(list1);
        ListNode l2 = ListNode.create(list2);
        ListNode a1 = ListNode.create(ans1);
        assertEquals(a1.toString(), leetcode23.mergeTwoLists(l1, l2).toString());
    }

    @Test
    void mergeKLists() {
        int[] list1 = {1, 4, 5};
        int[] list2 = {1, 3, 4};
        int[] list3 = {2, 6};
        int[] list4 = {};
        int[] ans1 = {1, 1, 2, 3, 4, 4, 5 ,6};
        ListNode l1 = ListNode.create(list1);
        ListNode l2 = ListNode.create(list2);
        ListNode l3 = ListNode.create(list3);
        ListNode l4 = ListNode.create(list4);
        ListNode a1 = ListNode.create(ans1);
        assertEquals(a1.toString(), leetcode23.mergeKLists(new ListNode[] {l1, l2, l3}).toString());
        assertNull(leetcode23.mergeKLists(new ListNode[] {l4}));
    }
}