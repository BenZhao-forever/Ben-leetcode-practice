import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/11
 * Project: Ben-leetcode-practice
 */
class leetcode206Test {

    @Test
    void reverseList() {
        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = {1, 2};
        int[] ans1 = {5, 4, 3, 2, 1};
        int[] ans2 = {2, 1};
        ListNode l1 = ListNode.create(list1);
        ListNode l2 = ListNode.create(list2);
        ListNode a1 = ListNode.create(ans1);
        ListNode a2 = ListNode.create(ans2);
        assertEquals(l1.toString(), leetcode206.reverseList(a1).toString());
        assertEquals(l2.toString(), leetcode206.reverseList(a2).toString());
    }
}