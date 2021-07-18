import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/18
 * Project: Ben-leetcode-practice
 */
class leetcode1403Test {

    @Test
    void minSubsequence() {
        assertArrayEquals(new int[] {10, 9}, leetcode1403.minSubsequence(new int[] {4, 3, 10, 9, 8}).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[] {7, 7, 6}, leetcode1403.minSubsequence(new int[] {4, 4, 7, 6, 7}).stream().mapToInt(Integer::intValue).toArray());
        assertArrayEquals(new int[] {6}, leetcode1403.minSubsequence(new int[] {6}).stream().mapToInt(Integer::intValue).toArray());
    }
}