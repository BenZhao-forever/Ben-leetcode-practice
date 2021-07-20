import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/20
 * Project: Ben-leetcode-practice
 */
class leetcode977Test {

    @Test
    void sortedSquares() {
        assertArrayEquals(new int[] {0, 1, 9, 16, 100}, leetcode977.sortedSquares(new int[] {-4, -1, 0, 3, 10}));
        assertArrayEquals(new int[] {4,9,9,49,121}, leetcode977.sortedSquares(new int[] {-7,-3,2,3,11}));
    }
}