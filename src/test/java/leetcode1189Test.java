import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode1189Test {

    @Test
    void maxNumberOfBalloons() {
        assertEquals(1, leetcode1189.maxNumberOfBalloons("nlaebolko"));
        assertEquals(2, leetcode1189.maxNumberOfBalloons("loonbalxballpoon"));
        assertEquals(0, leetcode1189.maxNumberOfBalloons("leetcode"));
    }
}