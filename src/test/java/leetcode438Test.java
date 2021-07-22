import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/22
 * Project: Ben-leetcode-practice
 */
class leetcode438Test {

    @Test
    void findAnagrams() {
        List<Integer> list1 = leetcode438.findAnagrams("cbaebabacd", "abc");
        int[] l1 = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            l1[i] = list1.get(i);
        }
        List<Integer> list2 = leetcode438.findAnagrams("abab", "ab");
        int[] l2 = new int[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            l2[i] = list2.get(i);
        }
        assertArrayEquals(new int[] {0, 6}, l1);
        assertArrayEquals(new int[] {0, 1, 2}, l2);
    }
}