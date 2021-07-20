import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/19
 * Project: Ben-leetcode-practice
 */
class leetcode1845Test {

    @Test
    void main() {
        leetcode1845 test = new leetcode1845();
        test.SeatManager(5);
        assertEquals(1, test.reserve());
        assertEquals(2, test.reserve());
        test.unreserve(2);
        assertEquals(2, test.reserve());
        assertEquals(3, test.reserve());
        assertEquals(4, test.reserve());
        assertEquals(5, test.reserve());
    }
}