import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode171Test {

    @Test
    void titleToNumber() {
        assertEquals(1, leetcode171.titleToNumber("A"));
        assertEquals(28, leetcode171.titleToNumber("AB"));
        assertEquals(701, leetcode171.titleToNumber("ZY"));
        assertEquals(2147483647, leetcode171.titleToNumber("FXSHRXW"));
    }
}