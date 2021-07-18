import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/18
 * Project: Ben-leetcode-practice
 */
class leetcode926Test {

    @Test
    void minFlipsMonoIncr() {
        assertEquals(1, leetcode926.minFlipsMonoIncr("00110"));
        assertEquals(2, leetcode926.minFlipsMonoIncr("010110"));
        assertEquals(2, leetcode926.minFlipsMonoIncr("00011000"));
        assertEquals(3, leetcode926.minFlipsMonoIncr("0101100011"));
    }
}