import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode347Test {

    @Test
    void topKFrequent() {
        assertArrayEquals(new int[] {1, 2}, leetcode347.topKFrequent(new int[] {1,1,1,2,2,3}, 2));
        assertArrayEquals(new int[] {1}, leetcode347.topKFrequent(new int[] {1}, 1));
    }
}