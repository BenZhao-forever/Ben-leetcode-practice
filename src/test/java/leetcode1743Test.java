import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/24
 * Project: Ben-leetcode-practice
 */
class leetcode1743Test {

    @Test
    void restoreArray() {
        assertArrayEquals(new int[] {1, 2, 3, 4}, leetcode1743.restoreArray(new int[][] {{2,1},{3,4},{3,2}}));
    }
}