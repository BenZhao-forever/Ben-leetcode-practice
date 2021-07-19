import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/19
 * Project: Ben-leetcode-practice
 */
class leetcode1100Test {

    @Test
    void numKLenSubstrNoRepeats() {
        assertEquals(6, leetcode1100.numKLenSubstrNoRepeats("havefunonleetcode", 5));
        assertEquals(0, leetcode1100.numKLenSubstrNoRepeats("home", 5));
    }
}