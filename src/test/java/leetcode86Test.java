import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
class leetcode86Test {

    @Test
    void partition() {
        int[] list1 = {1, 4, 3, 2, 5, 2};
        int[] list2 = {2, 1};
        int[] ans1 = {1, 2, 2, 4, 3, 5};
        int[] ans2 = {1, 2};
        ListNode l1 = ListNode.create(list1);
        ListNode l2 = ListNode.create(list2);
        ListNode a1 = ListNode.create(ans1);
        ListNode a2 = ListNode.create(ans2);
        assertEquals(a1.toString(), leetcode86.partition(l1, 3).toString());
        assertEquals(a2.toString(), leetcode86.partition(l2, 2).toString());
    }
}