import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/11
 * Project: Ben-leetcode-practice
 */
class leetcode83Test {

    @Test
    void deleteDuplicates() {
        int[] array1 = {1, 1, 2};
        int[] array2 = {1, 1, 2, 3, 3};
        int[] ans1 = {1, 2};
        int[] ans2 = {1, 2, 3};
        ListNode list1 = ListNode.create(array1);
        ListNode list2 = ListNode.create(array2);
        ListNode a1 =  ListNode.create(ans1);
        ListNode a2 = ListNode.create(ans2);
        assertEquals(a1.toString(), leetcode83.deleteDuplicates(list1).toString());
        assertEquals(a2.toString(), leetcode83.deleteDuplicates(list2).toString());
    }
}