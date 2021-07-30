import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/29
 * Project: Ben-leetcode-practice
 */
class leetcode454Test {

    @Test
    void fourSumCount() {
        assertEquals(2, leetcode454.fourSumCount(new int[] {1, 2}, new int[] {-1, -2}, new int[] {-1, 2}, new int[] {0, 2}));
        assertEquals(6, leetcode454.fourSumCount(new int[] {-1, -1}, new int[] {-1, 1}, new int[] {-1, 1}, new int[] {1, -1}));
    }
}