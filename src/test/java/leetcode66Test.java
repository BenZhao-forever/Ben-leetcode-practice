import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/13
 * Project: Ben-leetcode-practice
 */
class leetcode66Test {

    @Test
    void plusOne() {
        assertArrayEquals(new int[] {1, 2, 4}, leetcode66.plusOne(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {1}, leetcode66.plusOne(new int[] {0}));
        assertArrayEquals(new int[] {4, 3, 2, 2}, leetcode66.plusOne(new int[] {4, 3, 2, 1}));
        assertArrayEquals(new int[] {1, 0, 0}, leetcode66.plusOne(new int[] {9, 9}));
    }
}