import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/17
 * Project: Ben-leetcode-practice
 */
class leetcode283Test {

    @Test
    void moveZeroes() {
        int[] list1 = {0, 1, 0, 3, 12};
        leetcode283.moveZeroes(list1);
        assertArrayEquals(new int[] {1,3,12,0,0}, list1);
        int[] list2 = {0};
        leetcode283.moveZeroes(list2);
        assertArrayEquals(new int[] {0}, list2);
    }
}