import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode392Test {

    @Test
    void isSubsequence() {
        assertTrue(leetcode392.isSubsequence("abc", "ahbgdc"));
        assertFalse(leetcode392.isSubsequence("axc", "ahbgdc"));
        assertFalse(leetcode392.isSubsequence("aaaaaa", "bbaaaa"));
    }
}