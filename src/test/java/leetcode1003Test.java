import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode1003Test {

    @Test
    void isValid() {
        assertTrue(leetcode1003.isValid("aabcbc"));
        assertTrue(leetcode1003.isValid("abcabcababcc"));
        assertFalse(leetcode1003.isValid("abccba"));
    }
}