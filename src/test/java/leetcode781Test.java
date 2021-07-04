import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/4
 * Project: Ben-leetcode-practice
 */
class leetcode781Test {

    @Test
    void numRabbits() {
        assertEquals(5, leetcode781.numRabbits(new int[] {1, 1, 2}));
        assertEquals(11, leetcode781.numRabbits(new int[] {10, 10, 10}));
        assertEquals(0, leetcode781.numRabbits(new int[] {}));
        assertEquals(5, leetcode781.numRabbits(new int[] {1, 0, 1, 0, 0}));
        assertEquals(7, leetcode781.numRabbits(new int[] {0, 2, 0, 2, 1}));
        assertEquals(26, leetcode781.numRabbits(new int[] {0, 3, 2, 0, 3, 3, 4, 2, 4, 3, 2, 4, 4, 3, 0, 1, 3, 4, 4, 3}));
    }

    @Test
    void getRabbits() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(3, 7);
        assertEquals(8, leetcode781.getRabbits(map));
    }
}