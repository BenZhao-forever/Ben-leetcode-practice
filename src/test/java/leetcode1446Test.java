import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode1446Test {

    @Test
    void maxPower() {
        assertEquals(2, leetcode1446.maxPower("leetcode"));
        assertEquals(5, leetcode1446.maxPower("abbcccdddeeeeedcba"));
        assertEquals(5, leetcode1446.maxPower("triplepillooooow"));
        assertEquals(11, leetcode1446.maxPower("hooraaaaaaaaaaay"));
        assertEquals(1, leetcode1446.maxPower("tourist"));
    }
}