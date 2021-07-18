import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/17
 * Project: Ben-leetcode-practice
 */
class leetcode844Test {

    @Test
    void backspaceCompare() {
        assertTrue(leetcode844.backspaceCompare("ab#c", "ad#c"));
        assertTrue(leetcode844.backspaceCompare("ab##", "c#d#"));
        assertTrue(leetcode844.backspaceCompare("a##c", "#a#c"));
        assertFalse(leetcode844.backspaceCompare("a#c", "b"));
    }
}