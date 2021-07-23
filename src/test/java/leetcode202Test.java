import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/22
 * Project: Ben-leetcode-practice
 */
class leetcode202Test {

    @Test
    void isHappy() {
        assertTrue(leetcode202.isHappy(19));
        assertFalse(leetcode202.isHappy(2));
        assertTrue(leetcode202.isHappy(1));
    }
}