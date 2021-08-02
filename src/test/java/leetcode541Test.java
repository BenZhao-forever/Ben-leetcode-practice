import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode541Test {

    @Test
    void reverseStr() {
        assertEquals("abcdefg", leetcode541.reverseStr("bacdfeg", 2));
    }
}