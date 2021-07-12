import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/11
 * Project: Ben-leetcode-practice
 */
class leetcode21Test {

    @Test
    void mergeTwoLists() {
        int[] list1 = {1, 2, 4};
        int[] list2 = {1, 3, 4};
        int[] ans1 = {1, 1,2 ,3, 4, 4};
        ListNode l1 = ListNode.create(list1);
        ListNode l2 = ListNode.create(list2);
        ListNode a1 = ListNode.create(ans1);
        assertEquals(a1.toString(), leetcode21.mergeTwoLists(l1, l2).toString());
    }
}