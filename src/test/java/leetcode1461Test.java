import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/15
 * Project: Ben-leetcode-practice
 */
class leetcode1461Test {

    @Test
    void hasAllCodes() {
        assertTrue(leetcode1461.hasAllCodes("00110110", 2));
        assertTrue(leetcode1461.hasAllCodes("00110", 2));
        assertTrue(leetcode1461.hasAllCodes("0110", 1));
        assertFalse(leetcode1461.hasAllCodes("0110", 2));
        assertFalse(leetcode1461.hasAllCodes("0000000001011100", 4));
    }
}