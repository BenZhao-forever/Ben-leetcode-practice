import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode224Test {

    @Test
    void calculate() {
        assertEquals(2, leetcode224.calculate(" 1 + 1"));
        assertEquals(3, leetcode224.calculate("2-1 + 2"));
        assertEquals(23, leetcode224.calculate("(1+ (4+5+2)-3) + (6+8)"));
    }
}