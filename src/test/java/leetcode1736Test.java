import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/23
 * Project: Ben-leetcode-practice
 */
class leetcode1736Test {

    @Test
    void maximumTime() {
        assertArrayEquals("23:50".toCharArray(), leetcode1736.maximumTime("2?:?0").toCharArray());
        assertArrayEquals("09:39".toCharArray(), leetcode1736.maximumTime("0?:3?").toCharArray());
        assertArrayEquals("19:22".toCharArray(), leetcode1736.maximumTime("1?:22").toCharArray());
    }
}