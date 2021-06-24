import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/6/23
 * Project: Ben-leetcode-practice
 */
class leetcode25Test {

    @Test
    void reverse() {
        int[] list1 = {1,2,3,4,5};
        int[] list2 = {3,2,1,4,5};
        int[] list3 = {2,1,3,4,5};
        int[] list4 = {3,4,5};
        int[] list5 = {4,3,5};
        int[] list6 = {4,3,2,1,5};
        ListNode head1 = ListNode.create(list1);
        ListNode head2 = ListNode.create(list2);
        ListNode head3 = ListNode.create(list3);
        ListNode head4 = ListNode.create(list4);
        ListNode head5 = ListNode.create(list5);
        ListNode head6 = ListNode.create(list6);
        assertEquals(ListNode.toString(head3), ListNode.toString(leetcode25.reverse(head1, 2)));
        assertEquals(ListNode.toString(head5), ListNode.toString(leetcode25.reverse(head4, 2)));

        assertEquals(ListNode.toString(head2), ListNode.toString(leetcode25.reverse(head1, 3)));
        assertEquals(ListNode.toString(head6), ListNode.toString(leetcode25.reverse(head1, 4)));
    }

    @Test
    void reverseKGroup() {
        int[] list1 = {1,2,3,4,5};
        int[] list2 = {2,1,4,3,5};
        int[] list3 = {3,2,1,4,5};
        int[] list4 = {4,3,2,1,5};
        ListNode head1 = ListNode.create(list1);
        ListNode head2 = ListNode.create(list2);
        ListNode head3 = ListNode.create(list3);
        ListNode head4 = ListNode.create(list4);
        assertEquals(ListNode.toString(head3), ListNode.toString(leetcode25.reverseKGroup(head1, 3)));
        assertEquals(ListNode.toString(head4), ListNode.toString(leetcode25.reverseKGroup(head1, 4)));
        assertEquals(ListNode.toString(head2), ListNode.toString(leetcode25.reverseKGroup(head1, 2)));


    }
}