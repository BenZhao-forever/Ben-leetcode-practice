import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
class leetcode148Test {

    @Test
    void sortList() {
        int[] list1 = {4, 2, 1, 3};
        int[] list2 = {-1, 5, 3, 4, 0};
        int[] ans1 = {1, 2, 3, 4};
        int[] ans2 = {-1, 0, 3, 4, 5};
        ListNode l1 = ListNode.create(list1);
        ListNode l2 = ListNode.create(list2);
        ListNode a1 = ListNode.create(ans1);
        ListNode a2 = ListNode.create(ans2);
        assertEquals(a1.toString(), leetcode148.sortList(l1).toString());
        assertEquals(a2.toString(), leetcode148.sortList(l2).toString());
    }
}