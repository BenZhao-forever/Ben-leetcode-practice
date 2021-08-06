import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/8/3
 * Project: Ben-leetcode-practice
 */
class leetcode459Test {

    @Test
    void repeatedSubstringPattern() {
        assertTrue(leetcode459.repeatedSubstringPattern("abab"));
        assertTrue(leetcode459.repeatedSubstringPattern("abcabcabcabc"));
        assertFalse(leetcode459.repeatedSubstringPattern("aba"));
    }
}