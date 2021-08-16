import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode1696Test {

    @Test
    void maxResult() {
        assertEquals(7, leetcode1696.maxResult(new int[] {1, -1, -2, 4, -7, 3}, 2));
        assertEquals(17, leetcode1696.maxResult(new int[] {10, -5, -2, 4, 0, 3}, 3));
        assertEquals(0, leetcode1696.maxResult(new int[] {1, -5, -20, 4, -1, 3, -6, -3}, 2));
    }
}