import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/13
 * Project: Ben-leetcode-practice
 */
class leetcode27Test {

    @Test
    void removeElement() {
        int[] list1 = {3, 2, 2, 3};
        int[] list2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int[] list3 = {3};
        assertEquals(2, leetcode27.removeElement(list1, 3));
        assertEquals(5, leetcode27.removeElement(list2, 2));
        assertEquals(0, leetcode27.removeElement(list3, 3));
    }
}