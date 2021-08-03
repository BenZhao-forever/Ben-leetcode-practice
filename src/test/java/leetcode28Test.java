import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/13
 * Project: Ben-leetcode-practice
 */
class leetcode28Test {

    @Test
    void strStr() {
        assertEquals(2, leetcode28.strStr("hello", "ll"));
        assertEquals(-1, leetcode28.strStr("hello", "lol"));
        assertEquals(3, leetcode28.strStr("hello", "lo"));
    }

    @Test
    void makeNext() {
        assertArrayEquals(new int[] {0,0,1,1,2,3,2,3}, leetcode28.makeNext("ABAABABA"));
    }
}