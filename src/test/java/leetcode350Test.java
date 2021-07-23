import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/22
 * Project: Ben-leetcode-practice
 */
class leetcode350Test {

    @Test
    void intersect() {
        assertArrayEquals(new int[] {2, 2}, leetcode350.intersect(new int[] {1, 2, 2, 1}, new int[] {2, 2}));
        assertArrayEquals(new int[] {4, 9}, leetcode350.intersect(new int[] {4,9,5}, new int[] {9,4,9,8,4}));
    }
}