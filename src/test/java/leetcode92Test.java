import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/7
 * Project: Ben-leetcode-practice
 */
class leetcode92Test {

    @Test
    void reverseBetween() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] ans1 = {1, 4, 3, 2, 5};
        int[] ans2 = {2, 1, 3, 4, 5};
        int[] ans3 = {1, 2, 3, 5, 4};
        ListNode l1 = ListNode.create(array1);
        ListNode a1 = ListNode.create(ans1);
        ListNode a2 = ListNode.create(ans2);
        ListNode a3 = ListNode.create(ans3);
        assertEquals(a1.toString(), leetcode92.reverseBetween(l1, 2, 4).toString());
        assertEquals(a2.toString(), leetcode92.reverseBetween(l1, 1, 2).toString());
        assertEquals(a3.toString(), leetcode92.reverseBetween(l1, 4, 5).toString());
    }
}