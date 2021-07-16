import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/15
 * Project: Ben-leetcode-practice
 */
class jianzhi18Test {

    @Test
    void deleteNode() {
        int[] list1 = {4, 5, 1, 9};
        int[] ans1 = {4, 1, 9};
        int[] ans2 = {4, 5, 1};
        ListNode l1 = ListNode.create(list1);
        ListNode a1 = ListNode.create(ans1);
        ListNode a2 = ListNode.create(ans2);

        assertEquals(a1.toString(), jianzhi18.deleteNode(l1, 5).toString());
        l1 = ListNode.create(list1);
        assertEquals(a2.toString(), jianzhi18.deleteNode(l1, 9).toString());
    }
}