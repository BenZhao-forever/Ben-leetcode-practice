import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
class leetcode121Test {

    @Test
    void maxProfit() {
        assertEquals(5, leetcode121.maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
        assertEquals(0, leetcode121.maxProfit(new int[] {7, 6, 4, 3, 1}));
    }
}