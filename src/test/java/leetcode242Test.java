import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/22
 * Project: Ben-leetcode-practice
 */
class leetcode242Test {

    @Test
    void isAnagram() {
        assertTrue(leetcode242.isAnagram("anagram", "nagaram"));
        assertFalse(leetcode242.isAnagram("rat", "car"));
    }
}