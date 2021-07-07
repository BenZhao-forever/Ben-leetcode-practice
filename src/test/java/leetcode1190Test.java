import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/4
 * Project: Ben-leetcode-practice
 */
class leetcode1190Test {

    @Test
    void reverseParentheses() {
        //assertEquals("dcba", leetcode1190.reverseParentheses("(abcd)"));
        //assertEquals("iloveu", leetcode1190.reverseParentheses("(u(love)i)"));
        //assertEquals("leetcode", leetcode1190.reverseParentheses("(ed(et(oc))el)"));
        //assertEquals("apmnolkjihgfedcbq", leetcode1190.reverseParentheses("a(bcdefghijkl(mno)p)q"));
        assertEquals("tauswa", leetcode1190.reverseParentheses("ta()usw((((a))))"));
    }

    @Test
    void reverse() {
        assertEquals("a(bcdefghijkl)onm(p)q", leetcode1190.reverse(13,17,"a(bcdefghijkl(mno)p)q"));
        assertEquals("a)p(mno)lkjihgfedcb(q", leetcode1190.reverse(1,19,"a(bcdefghijkl)onm(p)q"));
    }
}