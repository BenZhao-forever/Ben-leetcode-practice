import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode227Test {

    @Test
    void calculate() {
        assertEquals(-2147483647, leetcode227.calculate("0-2147483647"));
        assertEquals(1, leetcode227.calculate("1-1+1"));
        assertEquals(7, leetcode227.calculate("3+2*2"));
        assertEquals(1, leetcode227.calculate(" 3/2 "));
        assertEquals(5, leetcode227.calculate("    3+5 / 2 "));
        assertEquals(0, leetcode227.calculate("0"));


    }
}