import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/12/3
 * Project: Ben-leetcode-practice
 */
class leetcode594Test {

    @Test
    void findLHS() {
        assertEquals(5, leetcode594.findLHS(new int[] {1,3,2,2,5,2,3,7}));
        assertEquals(2, leetcode594.findLHS(new int[] {1,2,3,4}));
        assertEquals(3, leetcode594.findLHS(new int[] {1,2,3,3,1,-14,13,4}));
    }
}