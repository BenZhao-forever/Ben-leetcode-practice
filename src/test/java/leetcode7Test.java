import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode7Test {

    @Test
    void reverse() {
        assertEquals(321, leetcode7.reverse(123));
        assertEquals(-321, leetcode7.reverse(-123));
        assertEquals(21, leetcode7.reverse(120));
        assertEquals(0, leetcode7.reverse(0));
        assertEquals(0, leetcode7.reverse(2147483647));
        assertEquals(0, leetcode7.reverse(-2147483647));
        assertEquals(-4321, leetcode7.reverse(-1234));
        assertEquals(-2147483641, leetcode7.reverse(-1463847412));
    }
}