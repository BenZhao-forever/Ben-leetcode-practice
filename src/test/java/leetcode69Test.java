import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
class leetcode69Test {

    @Test
    void mySqrt() {
        assertEquals(2, leetcode69.mySqrt(4));
        assertEquals(2, leetcode69.mySqrt(5));
        assertEquals(2, leetcode69.mySqrt(6));
        assertEquals(0, leetcode69.mySqrt(0));
        assertEquals(2, leetcode69.mySqrt(8));
        assertEquals(46339, leetcode69.mySqrt(2147395599));
    }
}