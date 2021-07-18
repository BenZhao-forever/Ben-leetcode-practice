import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/17
 * Project: Ben-leetcode-practice
 */
class findaPairTest {

    @Test
    void findaPairFromTwo() {
        assertArrayEquals(new int[] {1, 0}, findaPair.findaPairFromTwo(new int[] {12, 14, 16}, new int[] {2}, 17).get(0));
        assertArrayEquals(new int[] {1, 3}, findaPair.findaPairFromTwo(new int[] {3, 5, 7, 10}, new int[] {2,3,4,5}, 10).get(1));
        assertArrayEquals(new int[] {2, 1}, findaPair.findaPairFromTwo(new int[] {3, 5, 7, 10}, new int[] {2,3,4,5}, 10).get(0));
        assertArrayEquals(new int[] {2, 0}, findaPair.findaPairFromTwo(new int[] {8, 7, 14}, new int[] {5, 10, 14}, 20).get(0));
        assertArrayEquals(new int[] {0, 2}, findaPair.findaPairFromTwo(new int[] {8, 15, 9}, new int[] {8, 11, 12}, 20).get(1));
        assertArrayEquals(new int[] {2, 1}, findaPair.findaPairFromTwo(new int[] {8, 15, 9}, new int[] {8, 11, 12}, 20).get(0));
        assertArrayEquals(new int[] {1, 0}, findaPair.findaPairFromTwo(new int[] {-5, -8, 0}, new int[] {1, 2, 3}, -7).get(0));
        assertArrayEquals(new int[] {0, 2}, findaPair.findaPairFromTwo(new int[] {-5, -8, 0}, new int[] {1, 2, 3}, -1).get(0));

    }

    @Test
    void testFindaPairFromTwo() {
        assertArrayEquals(new int[] {1, 0}, findaPair.findaPairFromTwo(new int[] {12, 14, 16}, new int[] {2}, 17).get(0));
        assertArrayEquals(new int[] {1, 3}, findaPair.findaPairFromTwo(new int[] {3, 5, 7, 10}, new int[] {2, 3, 4, 6}, 10).get(1));
        assertArrayEquals(new int[] {2, 1}, findaPair.findaPairFromTwo(new int[] {3, 5, 7, 10}, new int[] {2, 3, 4, 6}, 10).get(0));
        assertArrayEquals(new int[] {2, 0}, findaPair.findaPairFromTwo(new int[] {8, 7, 14}, new int[] {5, 10, 14}, 20).get(0));
        assertArrayEquals(new int[] {1, 0}, findaPair.findaPairFromTwo(new int[] {8, 15, 9}, new int[] {8, 11, 12}, 20).get(0));
        assertArrayEquals(new int[] {0, 2}, findaPair.findaPairFromTwo(new int[] {12, 14, 16}, new int[] {2}, 17).get(0));
        assertArrayEquals(new int[] {2, 1}, findaPair.findaPairFromTwo(new int[] {12, 14, 16}, new int[] {2}, 17).get(1));
    }
    @Test
    void binarySearch() {
        int[] list1 = {3, 5, 7, 10};
        int[] list2 = {12, 14, 16};
        assertEquals(3, findaPair.binarySearch(list1, 11));
        assertEquals(3, findaPair.binarySearch(list1, 10));
        assertEquals(-1, findaPair.binarySearch(list1, 1));
        assertEquals(0, findaPair.binarySearch(list1, 4));
        assertEquals(2, findaPair.binarySearch(list1, 7));
        assertEquals(1, findaPair.binarySearch(list1, 5));
        assertEquals(2, findaPair.binarySearch(list1, 8));
        assertEquals(1, findaPair.binarySearch(list2, 15));
    }
}