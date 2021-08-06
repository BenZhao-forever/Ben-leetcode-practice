import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode1025Test {

    @Test
    void divisorGame() {
        assertTrue(leetcode1025.divisorGame(2));
        assertFalse(leetcode1025.divisorGame(3));
    }
}