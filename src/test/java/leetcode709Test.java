import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/7
 * Project: Ben-leetcode-practice
 */
class leetcode709Test {

    @Test
    void toLowerCase() {
        assertEquals("hello", leetcode709.toLowerCase("Hello"));
        assertEquals("here", leetcode709.toLowerCase("here"));
        assertEquals("lovely", leetcode709.toLowerCase("LOVELY"));
    }
}