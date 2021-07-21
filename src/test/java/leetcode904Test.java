import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/20
 * Project: Ben-leetcode-practice
 */
class leetcode904Test {

    @Test
    void totalFruit() {
        assertEquals(3, leetcode904.totalFruit(new int[] {1,2,1}));
        assertEquals(3, leetcode904.totalFruit(new int[] {0,1,2,2}));
        assertEquals(4, leetcode904.totalFruit(new int[] {1,2,3,2,2}));
        assertEquals(5, leetcode904.totalFruit(new int[] {3,3,3,1,2,1,1,2,3,3,4}));
    }
}