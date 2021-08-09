import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class leetcode1646Test {

    @Test
    void getMaximumGenerated() {
//        assertEquals(3, leetcode1646.getMaximumGenerated(7));
//        assertEquals(1, leetcode1646.getMaximumGenerated(2));
//        assertEquals(2, leetcode1646.getMaximumGenerated(3));
//        assertEquals(5, leetcode1646.getMaximumGenerated(15));
        Map<Integer, Integer> map = leetcode1646.getMaximumGenerated(15);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " + " + entry.getValue());
        }
    }
}