import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/22
 * Project: Ben-leetcode-practice
 */
class leetcode915Test {

    @Test
    void partitionDisjoint() {
        assertEquals(3, leetcode915.partitionDisjoint(new int[] {5, 0, 3, 8, 6}));
        assertEquals(4, leetcode915.partitionDisjoint(new int[] {1,1,1,0,6,12}));
    }
}