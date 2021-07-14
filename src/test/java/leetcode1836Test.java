import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/14
 * Project: Ben-leetcode-practice
 */
class leetcode1836Test {

    @Test
    void deleteDuplicatesUnsorted() {
        int[] list1 = {1, 2, 3, 2};
        int[] list2 = {2, 1, 1, 2};
        int[] list3 = {3, 2, 2, 1, 3, 2, 4};
        int[] ans1 = {1, 3};
        int[] ans2 = {};
        int[] ans3 = {1, 4};
        ListNode l1 = ListNode.create(list1);
        ListNode l2 = ListNode.create(list2);
        ListNode l3 = ListNode.create(list3);
        ListNode a1 = ListNode.create(ans1);
        ListNode a2 = ListNode.create(ans2);
        ListNode a3 = ListNode.create(ans3);
        assertEquals(a1.toString(), leetcode1836.deleteDuplicatesUnsorted(l1).toString());
        assertNull(leetcode1836.deleteDuplicatesUnsorted(l2));
        assertEquals(a3.toString(), leetcode1836.deleteDuplicatesUnsorted(l3).toString());
    }
}