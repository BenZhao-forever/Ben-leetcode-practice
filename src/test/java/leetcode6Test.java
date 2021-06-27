import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/6/24
 * Project: Ben-leetcode-practice
 */
class leetcode6Test {

    @Test
    void conver() {
        assertEquals("PAHNAPLSIIGYIR", leetcode6.conver("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", leetcode6.conver("PAYPALISHIRING", 4));
        assertEquals("A", leetcode6.conver("A", 1));
    }
}