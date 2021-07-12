import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
class leetcode725Test {

    @Test
    void splitListToParts() {
        int[] list1 = {1, 2, 3};
        int[] list2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] inner1 = {1};
        int[] inner2 = {2};
        int[] inner3 = {3};
        int[] inner4 = {1, 2, 3, 4};
        int[] inner5 = {5, 6, 7};
        int[] inner6 = {8, 9, 10};
        ListNode l1 = ListNode.create(list1);
        ListNode l2 = ListNode.create(list2);
        ListNode i1 = ListNode.create(inner1);
        ListNode i2 = ListNode.create(inner2);
        ListNode i3 = ListNode.create(inner3);
        ListNode i4 = ListNode.create(inner4);
        ListNode i5 = ListNode.create(inner5);
        ListNode i6 = ListNode.create(inner6);
        assertEquals(i1.toString(), leetcode725.splitListToParts(l1, 5)[0].toString());
        l1 = ListNode.create(list1);
        assertEquals(i2.toString(), leetcode725.splitListToParts(l1, 5)[1].toString());
        l1 = ListNode.create(list1);
        assertEquals(i3.toString(), leetcode725.splitListToParts(l1, 5)[2].toString());
        l1 = ListNode.create(list1);
        //assertNull(leetcode725.splitListToParts(l1, 5)[3].toString());
        l1 = ListNode.create(list1);
        //assertNull(leetcode725.splitListToParts(l1, 5)[4].toString());
        assertEquals(i4.toString(), leetcode725.splitListToParts(l2, 3)[0].toString());
        l2 = ListNode.create(list2);
        assertEquals(i5.toString(), leetcode725.splitListToParts(l2, 3)[1].toString());
        l2 = ListNode.create(list2);
        assertEquals(i6.toString(), leetcode725.splitListToParts(l2, 3)[2].toString());

    }
}