import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode387Test {

    @Test
    void firstUniqChar() {
        assertEquals(0, leetcode387.firstUniqChar("leetcode"));
        assertEquals(2, leetcode387.firstUniqChar("loveleetcode"));
    }
}