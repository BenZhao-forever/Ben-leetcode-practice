import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/13
 * Project: Ben-leetcode-practice
 */
class leetcode35Test {

    @Test
    void searchInsert() {
        assertEquals(2, leetcode35.searchInsert(new int[] {1, 3, 5, 6}, 5));
        assertEquals(1, leetcode35.searchInsert(new int[] {1, 3, 5, 6}, 2));
        assertEquals(4, leetcode35.searchInsert(new int[] {1, 3, 5, 6}, 7));
        assertEquals(0, leetcode35.searchInsert(new int[] {1, 3, 5, 6}, 0));
        assertEquals(0, leetcode35.searchInsert(new int[] {1}, 0));
    }
}