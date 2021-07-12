import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/11
 * Project: Ben-leetcode-practice
 */
class leetcode445Test {

    @Test
    void addTwoNumbers() {
        int[] list1 = {7, 2, 4 ,3};
        int[] list2 = {5, 6, 4};
        int[] list3 = {0};
        int[] list4 = {2, 4, 3};
        int[] list5 = {5, 6, 4};
        int[] ans1 = {7, 8, 0, 7};
        int[] ans2 = {8, 0, 7};
        ListNode l1 = ListNode.create(list1);
        ListNode l2 = ListNode.create(list2);
        ListNode l3 = ListNode.create(list3);
        ListNode l4 = ListNode.create(list4);
        ListNode l5 = ListNode.create(list5);
        ListNode a1 = ListNode.create(ans1);
        ListNode a2 = ListNode.create(ans2);
        assertEquals(a1.toString(), leetcode445.addTwoNumbers(l1, l2).toString());
        assertEquals(a2.toString(), leetcode445.addTwoNumbers(l4, l5).toString());
        assertEquals(l3.toString(), leetcode445.addTwoNumbers(l3, l3).toString());
    }
}