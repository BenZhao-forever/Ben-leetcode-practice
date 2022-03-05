import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class leetcode1249Test {

    @Test
    void minRemoveToMakeValid() {
        //assertEquals("lee(t(co)de)", leetcode1249.minRemoveToMakeValid("lee(t(c)o)d)e)"));
        assertEquals("ab(c)d", leetcode1249.minRemoveToMakeValid("a)b(c)d"));
        assertEquals("", leetcode1249.minRemoveToMakeValid("))(("));
    }
}