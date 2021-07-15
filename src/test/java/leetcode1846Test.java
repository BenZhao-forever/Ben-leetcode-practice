import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/14
 * Project: Ben-leetcode-practice
 */
class leetcode1846Test {

    @Test
    void maximumElementAfterDecrementingAndRearranging() {
        assertEquals(2, leetcode1846.maximumElementAfterDecrementingAndRearranging(new int[] {2, 2, 1, 2, 1}));
        assertEquals(3, leetcode1846.maximumElementAfterDecrementingAndRearranging(new int[] {100, 1, 100}));
        assertEquals(5, leetcode1846.maximumElementAfterDecrementingAndRearranging(new int[] {1, 2, 3, 4, 5}));
    }
}