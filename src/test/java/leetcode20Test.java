import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/6/23
 * Project: Ben-leetcode-practice
 */
class leetcode20Test {

    @Test
    void isValid() {
        assertTrue(leetcode20.isValid("()"));
        assertTrue(leetcode20.isValid("()[]{}"));
        assertFalse(leetcode20.isValid("(]"));
        assertFalse(leetcode20.isValid("([)]"));
        assertTrue(leetcode20.isValid("{[()]}"));
    }
}