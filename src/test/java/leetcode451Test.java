import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/2
 * Project: Ben-leetcode-practice
 */
class leetcode451Test {

    @Test
    void frequencySort() {
        assertEquals("eer",leetcode451.frequencySort("ree"));
        assertEquals("ccca",leetcode451.frequencySort("ccca"));
        assertTrue("bbAa".equals(leetcode451.frequencySort("Aabb")) || "bbaA".equals(leetcode451.frequencySort("Aabb")));
    }
}