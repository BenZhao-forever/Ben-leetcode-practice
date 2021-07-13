import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
class leetcode415Test {

    @Test
    void addStrings() {
        assertEquals("134", leetcode415.addStrings("11", "123"));
        assertEquals("533", leetcode415.addStrings("456", "77"));
        assertEquals("0", leetcode415.addStrings("0", "0"));
        assertEquals("6984362587", leetcode415.addStrings("6913259244", "71103343"));
    }
}