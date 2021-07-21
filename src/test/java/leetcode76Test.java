import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/20
 * Project: Ben-leetcode-practice
 */
class leetcode76Test {

    @Test
    void minWindow() {
        assertEquals("BANC", leetcode76.minWindow("ADOBECODEBANC", "ABC"));
        assertEquals("a", leetcode76.minWindow("a", "a"));
        assertEquals("", leetcode76.minWindow("a", "aa"));
    }
}