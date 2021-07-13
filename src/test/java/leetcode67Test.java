import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/13
 * Project: Ben-leetcode-practice
 */
class leetcode67Test {

    @Test
    void addBinary() {
        assertEquals("100", leetcode67.addBinary("11", "1"));
        assertEquals("10101", leetcode67.addBinary("1010", "1011"));
        assertEquals("110", leetcode67.addBinary("11", "11"));

    }
}