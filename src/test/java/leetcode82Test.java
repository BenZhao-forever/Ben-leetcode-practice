import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/4
 * Project: Ben-leetcode-practice
 */
class leetcode82Test {

    @Test
    void deletDuplicates() {
        int[] arrayA = {1, 2, 3, 3, 4, 4, 5};
        int[] arrayB = {1, 1, 1, 2, 3};
        int[] arrayC = {1, 2, 3, 3, 4, 4};
        int[] answerA = {1, 2, 5};
        int[] answerB = {2, 3};
        int[] answerC = {1, 2};
        ListNode listA = ListNode.create(arrayA);
        ListNode listB = ListNode.create(arrayB);
        ListNode listC = ListNode.create(arrayC);
        ListNode ansA = ListNode.create(answerA);
        ListNode ansB = ListNode.create(answerB);
        ListNode ansC = ListNode.create(answerC);
        assertEquals(ansA.toString(), leetcode82.deleteDuplicates(listA).toString());
        assertEquals(ansB.toString(), leetcode82.deleteDuplicates(listB).toString());
        assertEquals(ansC.toString(), leetcode82.deleteDuplicates(listC).toString());
    }
}