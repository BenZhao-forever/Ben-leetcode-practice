import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/15
 * Project: Ben-leetcode-practice
 */
class leetcode34Test {

    @Test
    void searchRange() {
        int[] list1 = {5, 7, 7, 8, 8, 10};
        assertArrayEquals(new int[] {3, 4}, leetcode34.searchRange(list1, 8));
        assertArrayEquals(new int[] {-1, -1}, leetcode34.searchRange(list1, 6));
        assertArrayEquals(new int[] {-1, -1}, leetcode34.searchRange(new int[] {}, 6));
    }

    @Test
    void binarySearch() {
        int[] list1 = {5, 7, 7, 8, 8, 10};
        assertEquals(0, leetcode34.binarySearch(list1, 5, true));
        assertEquals(0, leetcode34.binarySearch(list1, 5, false));
        assertEquals(1, leetcode34.binarySearch(list1, 7, true));
        assertEquals(2, leetcode34.binarySearch(list1, 7, false));
        assertEquals(5, leetcode34.binarySearch(list1, 10, true));
        assertEquals(5, leetcode34.binarySearch(list1, 10, false));
        assertEquals(-1, leetcode34.binarySearch(list1, 1, true));
        assertEquals(-1, leetcode34.binarySearch(list1, 1, false));
    }
}