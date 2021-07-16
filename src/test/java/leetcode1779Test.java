import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/15
 * Project: Ben-leetcode-practice
 */
class leetcode1779Test {

    @Test
    void nearestValidPoint() {
        int[][] list1 = {{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}};
        int[][] list2 = {{3, 4}};
        int[][] list3 = {{2, 3}};
        assertEquals(2, leetcode1779.nearestValidPoint(3, 4, list1));
        assertEquals(0, leetcode1779.nearestValidPoint(3, 4, list2));
        assertEquals(-1, leetcode1779.nearestValidPoint(3, 4, list3));
    }
}