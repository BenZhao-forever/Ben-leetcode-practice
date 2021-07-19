import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/19
 * Project: Ben-leetcode-practice
 */
class leetcode746Test {

    @Test
    void minCostClimbingStairs() {
        //assertEquals(15, leetcode746.minCostClimbingStairs(new int[] {10, 15, 20}));
        assertEquals(6, leetcode746.minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1}));
    }
}