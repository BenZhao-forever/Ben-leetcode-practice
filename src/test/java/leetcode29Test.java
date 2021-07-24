import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/23
 * Project: Ben-leetcode-practice
 */
class leetcode29Test {

    @Test
    void divide() {
        assertEquals(3, leetcode29.divide(10, 3));
        assertEquals(-2, leetcode29.divide(7, -3));
        assertEquals(0, leetcode29.divide(0, 1));
        assertEquals(1, leetcode29.divide(1, 1));
        assertEquals(2147483647, leetcode29.divide(-2147483647, -1));
    }
}