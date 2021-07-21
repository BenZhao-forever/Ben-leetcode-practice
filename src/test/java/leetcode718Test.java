import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/20
 * Project: Ben-leetcode-practice
 */
class leetcode718Test {

    @Test
    void findLength() {
        assertEquals(3, leetcode718.findLength(new int[] {1,2,3,2,1}, new int[] {3,2,1,4,7}));
        assertEquals(5, leetcode718.findLength(new int[] {0,0,0,0,0}, new int[] {0,0,0,0,0}));
    }
}