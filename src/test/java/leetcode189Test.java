import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/15
 * Project: Ben-leetcode-practice
 */
class leetcode189Test {

    @Test
    void rotate() {
        int[] list1 = {1, 2, 3, 4, 5, 6, 7};
        leetcode189.rotate(list1, 3);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, list1);
        int[] list2 = {-1, -100, 3, 99};
        leetcode189.rotate(list2, 2);
        assertArrayEquals(new int[]{3, 99, -1, -100}, list2);
    }
}