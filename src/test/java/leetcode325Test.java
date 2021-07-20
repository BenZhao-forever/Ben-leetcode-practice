import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/20
 * Project: Ben-leetcode-practice
 */
class leetcode325Test {

    @Test
    void maxSubArray() {
        assertEquals(4, leetcode325.maxSubArray(new int[] {1,-1,5,-2,3}, 3));
        assertEquals(2, leetcode325.maxSubArray(new int[] {-2,-1,2,1}, 1));
    }
}