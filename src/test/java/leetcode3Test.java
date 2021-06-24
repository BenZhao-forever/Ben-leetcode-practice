import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/6/24
 * Project: Ben-leetcode-practice
 */
class leetcode3Test {

    @Test
    void lengthOfLongestSubstring() {
        assertEquals(3, leetcode3.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(3, leetcode3.lengthOfLongestSubstring("pwwkew"));
        assertEquals(0, leetcode3.lengthOfLongestSubstring(""));
        assertEquals(1, leetcode3.lengthOfLongestSubstring("bbbbb"));
        assertEquals(6, leetcode3.lengthOfLongestSubstring("bbtablud"));
    }
}