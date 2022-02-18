import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode532Test {

    @Test
    void findPairs() {
        assertEquals(2, leetcode532.findPairs(new int[] {3,1,4,1,5}, 2));
        assertEquals(4, leetcode532.findPairs(new int[] {1,2,3,4,5}, 1));
        assertEquals(1, leetcode532.findPairs(new int[] {1,3,1,5,4}, 0));

    }
}