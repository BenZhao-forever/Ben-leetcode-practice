import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/15
 * Project: Ben-leetcode-practice
 */
class leetcode24Test {

    @Test
    void swapPairs() {
        int[] list1 = {1, 2, 3, 4};
        int[] ans1 = {2, 1, 4, 3};
        ListNode l1 = ListNode.create(list1);
        ListNode a1 = ListNode.create(ans1);
        int[] list2 = {1, 2, 3};
        int[] ans2 = {2, 1, 3};
        ListNode l2 = ListNode.create(list2);
        ListNode a2 = ListNode.create(ans2);
        assertEquals(a1.toString(), leetcode24.swapPairs(l1).toString());
        assertEquals(a2.toString(), leetcode24.swapPairs(l2).toString());
    }
}