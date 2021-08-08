import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode1137Test {

    @Test
    void tribonacci() {
        assertEquals(4, leetcode1137.tribonacci(4));
        assertEquals(1389537, leetcode1137.tribonacci(25));
        assertEquals(7, leetcode1137.tribonacci(5));
        assertEquals(1, leetcode1137.tribonacci(1));
        assertEquals(1, leetcode1137.tribonacci(2));

    }
}