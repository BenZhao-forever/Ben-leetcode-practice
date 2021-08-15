import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class reverseArrayTest {

    @Test
    void reverseArray() {
        int[] list = {5, 3, 2, 1, 3};
        reverseArray.reverseArray(list, new int[][] {{0,1},{1,3}});
        assertArrayEquals(new int[] {3,1,2,5,3}, list);
    }
}