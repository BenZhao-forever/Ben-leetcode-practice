import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/11
 * Project: Ben-leetcode-practice
 */
class leetcode61Test {

    @Test
    void rotateRight() {
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = {0, 1, 2};
        int[] ans1 = {4, 5, 1, 2, 3};
        int[] ans2 = {2, 0, 1};
        ListNode l1 = ListNode.create(list1);
        ListNode l2 = ListNode.create(list2);
        ListNode a1 = ListNode.create(ans1);
        ListNode a2 = ListNode.create(ans2);
        assertEquals(a1.toString(), leetcode61.rotateRight(l1, 2).toString());
        assertEquals(a2.toString(), leetcode61.rotateRight(l2, 4).toString());
    }
}