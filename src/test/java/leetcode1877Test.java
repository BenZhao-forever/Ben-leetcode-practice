import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/19
 * Project: Ben-leetcode-practice
 */
class leetcode1877Test {

    @Test
    void minPairSum() {
        assertEquals(7, leetcode1877.minPairSum(new int[] {3, 5, 2, 3}));
        assertEquals(8, leetcode1877.minPairSum(new int[] {3, 5, 4, 2, 4, 6}));
    }
}