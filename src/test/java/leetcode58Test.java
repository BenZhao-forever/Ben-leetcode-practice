import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/13
 * Project: Ben-leetcode-practice
 */
class leetcode58Test {

    @Test
    void lengthOfLashWord() {
        assertEquals(5, leetcode58.lengthOfLastWord("Hello World "));
        assertEquals(5, leetcode58.lengthOfLastWord("Hello World"));
        assertEquals(0, leetcode58.lengthOfLastWord(" "));
        assertEquals(0, leetcode58.lengthOfLastWord("  "));
        assertEquals(1, leetcode58.lengthOfLastWord("a"));
    }
}