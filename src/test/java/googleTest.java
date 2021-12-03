import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/9/15
 * Project: Ben-leetcode-practice
 */
class googleTest {

    @Test
    void seprate() {
        assertEquals(11, google.seprate(12001));
        assertEquals(5, google.seprate(510));
        assertEquals(0, google.seprate(7007));
        assertEquals(0, google.seprate(70000007));
        System.out.println(google.seprate(10));
        //System.out.println(google.seprate(15));
        //System.out.println(google.seprate(51));
        System.out.println(google.seprate(11));
        System.out.println(google.seprate(99));
        System.out.println(google.seprate(10101));
        System.out.println(google.seprate(100101));
        System.out.println(google.seprate(10000));

    }
}