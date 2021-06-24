import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/6/23
 * Project: Ben-leetcode-practice
 */
class ListNodeTest {

    @Test
    void print() {
        int[] a = {1, 2, 3, 4, 5};
        ListNode head = ListNode.create(a);
        ListNode.print(head);
    }

    @Test
    void testToString() {
        int[] a = {1, 2, 3, 4, 5};
        ListNode head = ListNode.create(a);
        System.out.print(ListNode.toString(head));
    }
}