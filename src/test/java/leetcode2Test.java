import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/6/24
 * Project: Ben-leetcode-practice
 */
class leetcode2Test {

    @Test
    void addTwoNumbers() {
        int[] list1 = {2,4,3};
        int[] list2 = {5,6,4};
        int[] list3 = {0};
        int[] list4 = {9,9,9,9,9,9,9};
        int[] list5 = {9,9,9,9};
        int[] list6 = {1};
        int[] list7 = {0,8,6,5,6,8,3,5,7};
        int[] list8 = {6,7,8,0,8,5,8,9,7};
        int[] ans1 = {7,0,8};
        int[] ans2 = {8,9,9,9,0,0,0,1};
        int[] ans3 = {0,0,0,0,1};
        int[] ans4 = {6,5,5,6,4,4,2,5,5,1};
        ListNode head1 = ListNode.create(list1);
        ListNode head2 = ListNode.create(list2);
        ListNode head3 = ListNode.create(list3);
        ListNode head4 =  ListNode.create(list4);
        ListNode head5 = ListNode.create(list5);
        ListNode head6 = ListNode.create(list6);
        ListNode head7 = ListNode.create(list7);
        ListNode head8 = ListNode.create(list8);
        ListNode ahead1 = ListNode.create(ans1);
        ListNode ahead2 = ListNode.create(ans2);
        ListNode ahead3 = ListNode.create(ans3);
        ListNode ahead4 = ListNode.create(ans4);
        assertEquals(ListNode.toString(ahead1), ListNode.toString(leetcode2.addTwoNumbers(head1, head2)));
        assertEquals(ListNode.toString(head3), ListNode.toString(leetcode2.addTwoNumbers(head3, head3)));
        assertEquals(ListNode.toString(ahead2), ListNode.toString(leetcode2.addTwoNumbers(head4, head5)));
        assertEquals(ListNode.toString(ahead3), ListNode.toString(leetcode2.addTwoNumbers(head6, head5)));
        assertEquals(ListNode.toString(ahead4), ListNode.toString(leetcode2.addTwoNumbers(head7, head8)));
    }
}