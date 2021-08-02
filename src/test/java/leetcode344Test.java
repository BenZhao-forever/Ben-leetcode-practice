import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode344Test {

    @Test
    void reverseString() {
        char[] list1 =new char[] {'h', 'e', 'l', 'l', 'o'};
        leetcode344.reverseString(list1);
        assertArrayEquals(new char[] {'o','l','l','e','h'}, list1);
    }
}