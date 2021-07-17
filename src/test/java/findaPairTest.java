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
        //assertArrayEquals(new int[] {1, 0}, findaPair.findaPairFromTwo(new int[] {12, 14, 16}, new int[] {2}, 17).get(0));
        assertArrayEquals(new int[] {1, 3}, findaPair.findaPairFromTwo(new int[] {3, 5, 7, 10}, new int[] {2,3,4,5}, 10).get(0));
        assertArrayEquals(new int[] {2, 1}, findaPair.findaPairFromTwo(new int[] {3, 5, 7, 10}, new int[] {2,3,4,5}, 10).get(1));
        assertArrayEquals(new int[] {2, 0}, findaPair.findaPairFromTwo(new int[] {8, 7, 14}, new int[] {5, 10, 14}, 20).get(0));
        assertArrayEquals(new int[] {0, 2}, findaPair.findaPairFromTwo(new int[] {8, 15, 9}, new int[] {8, 11, 12}, 20).get(0));
        assertArrayEquals(new int[] {2, 1}, findaPair.findaPairFromTwo(new int[] {8, 15, 9}, new int[] {8, 11, 12}, 20).get(1));
    }
}