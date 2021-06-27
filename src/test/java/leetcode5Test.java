import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/6/27
 * Project: Ben-leetcode-practice
 */
class leetcode5Test {
    @Test
    void palindrome() {
        assertEquals("bab", leetcode5.palindrome("babad", 1, 1));
        assertEquals("bb", leetcode5.palindrome("cbbd", 1, 2));
        assertEquals("aaa", leetcode5.palindrome("aaa", 1, 1));
    }

    @Test
    void longestPalindrome() {
        //assertEquals("bab", leetcode5.longestPalindrome("babad"));
        assertEquals("bb", leetcode5.longestPalindrome("cbbd"));
        assertEquals("a", leetcode5.longestPalindrome("a"));
        assertEquals("aaa", leetcode5.longestPalindrome("aaa"));
    }
}