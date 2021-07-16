import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/16
 * Project: Ben-leetcode-practice
 */
class leetcode704Test {

    @Test
    void search() {
        int[] list1 = {-1,0,3,5,9,12};
        assertEquals(4, leetcode704.search(list1, 9));
        assertEquals(-1, leetcode704.search(list1, 2));
    }
}