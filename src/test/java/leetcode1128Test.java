import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/19
 * Project: Ben-leetcode-practice
 */
class leetcode1128Test {

    @Test
    void numEquivDominoPairs() {
        assertEquals(1, leetcode1128.numEquivDominoPairs(new int[][] {{1, 2}, {2, 1}, {3, 4}, {5, 6}}));
        assertEquals(3, leetcode1128.numEquivDominoPairs(new int[][] {{1, 2}, {2, 1}, {3, 4}, {1, 2}}));
        assertEquals(3, leetcode1128.numEquivDominoPairs(new int[][] {{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}}));
        assertEquals(4, leetcode1128.numEquivDominoPairs(new int[][] {{1, 1}, {2, 2}, {1, 1}, {1, 2}, {1, 2}, {1, 1}}));
    }
}