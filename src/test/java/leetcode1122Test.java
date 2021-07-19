import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/19
 * Project: Ben-leetcode-practice
 */
class leetcode1122Test {

    @Test
    void relativeSortArray() {
        assertArrayEquals(new int[] {2,2,2,1,4,3,3,9,6,7,19}, leetcode1122.relativeSortArray(new int[] {2,3,1,3,2,4,6,7,9,2,19}, new int[] {2,1,4,3,9,6}));
    }
}