import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
class leetcode53Test {

    @Test
    void maxSubArray() {
        assertEquals(6, leetcode53.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(1, leetcode53.maxSubArray(new int[] {1}));
        assertEquals(23, leetcode53.maxSubArray(new int[] {5, 4, -1, 7, 8}));
    }
}