import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
class leetcode143Test {

    @Test
    void reorderList() {
        int[] list1 = {1, 2, 3 ,4};
        int[] list2 = {1, 2, 3, 4, 5};
        int[] ans1 = {1, 4, 2, 3};
        int[] ans2 = {1, 5, 2, 4, 3};
        ListNode l1 = ListNode.create(list1);
        ListNode l2 = ListNode.create(list2);
        ListNode a1 = ListNode.create(ans1);
        ListNode a2 = ListNode.create(ans2);
        leetcode143.reorderList(l1);
        assertEquals(a1.toString(),l1.toString());
        leetcode143.reorderList(l2);
        assertEquals(a2.toString(),l2.toString());
    }
}