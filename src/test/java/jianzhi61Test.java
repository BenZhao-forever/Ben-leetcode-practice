import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/15
 * Project: Ben-leetcode-practice
 */
class jianzhi61Test {

    @Test
    void isStraight() {
        assertTrue(jianzhi61.isStraight(new int[] {1,2,3,4,5}));
        assertTrue(jianzhi61.isStraight(new int[] {0,0,3,4,5}));
        assertFalse(jianzhi61.isStraight(new int[] {0,0,3,4,10}));
    }
}