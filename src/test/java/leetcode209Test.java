import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/20
 * Project: Ben-leetcode-practice
 */
class leetcode209Test {

    @Test
    void minSubArrayLen() {
        assertEquals(2, leetcode209.minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
        assertEquals(1, leetcode209.minSubArrayLen(4, new int[] {1, 4, 4}));
        assertEquals(0, leetcode209.minSubArrayLen(11, new int[] {1,1,1,1,1,1,1,1}));
    }
}