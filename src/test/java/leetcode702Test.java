import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/16
 * Project: Ben-leetcode-practice
 */
class leetcode702Test {

    @Test
    void search() {
        ArrayReader reader = new ArrayReader(new int[] {-1,0,3,5,9,12});
        assertEquals(4, leetcode702.search(reader, 9));
        assertEquals(-1, leetcode702.search(reader, 2));
    }
}