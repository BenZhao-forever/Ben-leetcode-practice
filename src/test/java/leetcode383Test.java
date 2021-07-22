import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/22
 * Project: Ben-leetcode-practice
 */
class leetcode383Test {

    @Test
    void canConstruct() {
        assertTrue(leetcode383.canConstruct("aa", "aab"));
        assertFalse(leetcode383.canConstruct("a", "b"));
        assertFalse(leetcode383.canConstruct("aa", "ab"));
    }
}