import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode1337Test {

    @Test
    void findSoldiers() {
        assertEquals(0, leetcode1337.findSoldiers(new int[] {0,0,0,0,0,0}));
        assertEquals(1, leetcode1337.findSoldiers(new int[] {1,0,0,0,0,0}));
        assertEquals(2, leetcode1337.findSoldiers(new int[] {1,1,0,0,0,0}));
        assertEquals(3, leetcode1337.findSoldiers(new int[] {1,1,1,0,0,0}));
    }

    @Test
    void kWeakestRows() {
        assertArrayEquals(new int[] {2, 0, 3}, leetcode1337.kWeakestRows(new int[][] {{1,1,0,0,0}, {1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}}, 3));
    }
}