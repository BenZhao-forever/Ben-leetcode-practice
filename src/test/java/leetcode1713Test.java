import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/25
 * Project: Ben-leetcode-practice
 */
class leetcode1713Test {

    @Test
    void minOperations() {
        //assertEquals(2, leetcode1713.minOperations(new int[] {5,1,3}, new int[] {9,4,2,3,4}));
        assertEquals(3, leetcode1713.minOperations(new int[] {6,4,8,1,3,2}, new int[] {4,7,6,2,3,8,6,1}));
        assertEquals(7, leetcode1713.minOperations(new int[] {5,10,8,11,3,15,9,20,18,13}, new int[] {15,8,2,9,11,20,8,11,7,2}));
    }
}