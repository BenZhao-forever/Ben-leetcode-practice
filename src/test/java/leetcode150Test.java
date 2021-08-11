import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode150Test {

    @Test
    void evalRPN() {
        assertEquals(9, leetcode150.evalRPN(new String[] {"2", "1", "+", "3", "*"}));
        assertEquals(6, leetcode150.evalRPN(new String[] {"4", "13", "5", "/", "+"}));
        assertEquals(22, leetcode150.evalRPN(new String[] {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }
}