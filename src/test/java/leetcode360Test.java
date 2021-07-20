import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/20
 * Project: Ben-leetcode-practice
 */
class leetcode360Test {

    @Test
    void sortTransformedArray() {
        assertArrayEquals(new int[] {3,9,15,33}, leetcode360.sortTransformedArray(new int[] {-4,-2,2,4}, 1, 3, 5));
        assertArrayEquals(new int[] {-23,-5,1,7}, leetcode360.sortTransformedArray(new int[] {-4,-2,2,4}, -1, 3, 5));
    }
}