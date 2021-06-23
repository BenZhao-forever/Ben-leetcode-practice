import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode9Test {

    @Test
    void isPalindrome() {
        assertTrue(leetcode9.isPalindrome(121));
        assertTrue(leetcode9.isPalindrome(0));
        assertFalse(leetcode9.isPalindrome(-121));
        assertFalse(leetcode9.isPalindrome(10121));
        assertFalse(leetcode9.isPalindrome(10));
    }

    @Test
    void reverse() {
        assertEquals(121, leetcode9.reverse(121));
    }
}