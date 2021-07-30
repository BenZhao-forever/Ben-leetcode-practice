import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/29
 * Project: Ben-leetcode-practice
 */
class leetcode345Test {

    @Test
    void reverseVowels() {
        assertEquals("holle", leetcode345.reverseVowels("hello"));
        assertEquals("leotcede", leetcode345.reverseVowels("leetcode"));
        assertEquals("a.", leetcode345.reverseVowels("a."));
    }
}