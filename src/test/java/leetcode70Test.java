import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
class leetcode70Test {

    @Test
    void climbStairs() {
        assertEquals(2, leetcode70.climbStairs(2));
        assertEquals(3, leetcode70.climbStairs(3));
    }
}