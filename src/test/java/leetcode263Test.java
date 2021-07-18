import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/18
 * Project: Ben-leetcode-practice
 */
class leetcode263Test {

    @Test
    void isUgly() {
        assertTrue(leetcode263.isUgly(6));
        assertTrue(leetcode263.isUgly(8));
        assertFalse(leetcode263.isUgly(14));
        assertTrue(leetcode263.isUgly(1));
        assertFalse(leetcode263.isUgly(-2147483648));
    }
}