import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode151Test {

    @Test
    void reverseWords() {
        assertEquals("blue is sky the", leetcode151.reverseWords("the sky is blue"));
        assertEquals("world hello", leetcode151.reverseWords("    hello world   "));
        assertEquals("a good example", leetcode151.reverseWords("example   good     a"));
        assertEquals("Bob Loves Alice", leetcode151.reverseWords("Alice   Loves                  Bob      "));
        assertEquals("Alice does not even like bob", leetcode151.reverseWords("bob like even not does Alice"));
    }
}