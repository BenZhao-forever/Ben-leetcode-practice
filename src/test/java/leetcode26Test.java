import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/13
 * Project: Ben-leetcode-practice
 */
class leetcode26Test {

    @Test
    void removeDuplicates() {
        int[] list1 = {1, 1, 2};
        int[] list2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(2, leetcode26.removeDuplicates(list1));
        assertEquals(1, list1[0]);
        assertEquals(2, list1[1]);
        assertEquals(5, leetcode26.removeDuplicates(list2));
        assertEquals(0, list2[0]);
        assertEquals(1, list2[1]);
        assertEquals(2, list2[2]);
        assertEquals(3, list2[3]);
        assertEquals(4, list2[4]);
    }
}