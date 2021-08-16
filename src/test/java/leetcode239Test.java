import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode239Test {

    @Test
    void maxSlidingWindow() {
        assertArrayEquals(new int[] {3,3,5,5,6,7}, leetcode239.maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3));
        assertArrayEquals(new int[] {1}, leetcode239.maxSlidingWindow(new int[] {1}, 1));
        assertArrayEquals(new int[] {1, -1}, leetcode239.maxSlidingWindow(new int[] {1,-1}, 1));
        assertArrayEquals(new int[] {11}, leetcode239.maxSlidingWindow(new int[] {9,11}, 2));
        assertArrayEquals(new int[] {4}, leetcode239.maxSlidingWindow(new int[] {4, -2}, 2));
    }
}