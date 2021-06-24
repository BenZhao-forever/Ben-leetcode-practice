import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/6/23
 * Project: Ben-leetcode-practice
 */
class leetcode14Test {

    @Test
    void longestCommonPrefix() {
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        String[] strs3 = {"abab", "aba", ""};
        assertEquals("fl", leetcode14.longestCommonPrefix(strs1));
        assertEquals("", leetcode14.longestCommonPrefix(strs2));
        assertEquals("", leetcode14.longestCommonPrefix(strs3));
    }
}