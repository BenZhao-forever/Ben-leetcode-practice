import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode122Test {

    @Test
    void maxProfit() {
        assertEquals(7, leetcode122.maxProfit(new int[] {7,1,5,3,6,4}));
        assertEquals(4, leetcode122.maxProfit(new int[] {1,2,3,4,5}));
        assertEquals(0, leetcode122.maxProfit(new int[] {7,6,4,3,1}));
    }
}