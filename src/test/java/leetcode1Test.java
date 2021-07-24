import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/23
 * Project: Ben-leetcode-practice
 */
class leetcode1Test {

    @Test
    void twoSum() {
        assertArrayEquals(new int[] {0, 1}, leetcode1.twoSum(new int[] {2, 7, 11, 15}, 9));
        assertArrayEquals(new int[] {1, 2}, leetcode1.twoSum(new int[] {3, 2, 4}, 6));
        assertArrayEquals(new int[] {0, 1}, leetcode1.twoSum(new int[] {3, 3}, 6));
    }
}