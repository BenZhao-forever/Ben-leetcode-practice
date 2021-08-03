import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode542Test {

    @Test
    void updateMatrix() {
        assertArrayEquals(new int[][] {{0,0,0},{0,1,0},{0,0,0}}, leetcode542.updateMatrix(new int[][] {{0,0,0},{0,1,0},{0,0,0}}));
        assertArrayEquals(new int[][] {{0,0,0},{0,1,0},{1,2,1}}, leetcode542.updateMatrix(new int[][] {{0,0,0},{0,1,0},{1,1,1}}));
    }
}