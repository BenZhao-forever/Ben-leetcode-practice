import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/18
 * Project: Ben-leetcode-practice
 */
class leetcode1925Test {

    @Test
    void countTriples() {
        assertEquals(2, leetcode1925.countTriples(5));
        assertEquals(4, leetcode1925.countTriples(10));
    }
}