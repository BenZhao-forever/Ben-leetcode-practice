import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode13Test {

    @Test
    void romanToInt() {
        assertEquals(3, leetcode13.romanToInt("III"));
        assertEquals(4, leetcode13.romanToInt("IV"));
        assertEquals(9, leetcode13.romanToInt("IX"));
        assertEquals(58, leetcode13.romanToInt("LVIII"));
        assertEquals(1994, leetcode13.romanToInt("MCMXCIV"));
    }
}