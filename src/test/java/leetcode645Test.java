import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/3
 * Project: Ben-leetcode-practice
 */
class leetcode645Test {

    @Test
    void findErrorNums() {
        assertArrayEquals(new int[] {1, 2}, leetcode645.findErrorNums(new int[] {1, 1}));
        assertArrayEquals(new int[] {2, 3}, leetcode645.findErrorNums(new int[] {1, 2, 2, 4}));
        assertArrayEquals(new int[] {2, 1}, leetcode645.findErrorNums(new int[] {2, 2}));
    }
}