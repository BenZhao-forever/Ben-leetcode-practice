import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/20
 * Project: Ben-leetcode-practice
 */
class leetcode54Test {

    @Test
    void spiralOrder() {
        int[][] list1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] list2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] list3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int[] ans1 = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        int[] ans2 = {1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7};
        int[] ans3 = {1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8};
        List<Integer> p1 = leetcode54.spiralOrder(list1);
        List<Integer> p2 = leetcode54.spiralOrder(list2);
        List<Integer> p3 = leetcode54.spiralOrder(list3);
        int[] pp1 = new int[p1.size()];
        int[] pp2 = new int[p2.size()];
        int[] pp3 = new int[p3.size()];
        for (int i = 0; i < p1.size(); i++) {
            pp1[i] = p1.get(i);
        }
        for (int i = 0; i < p2.size(); i++) {
            pp2[i] = p2.get(i);
        }
        for (int i = 0; i < p3.size(); i++) {
            pp3[i] = p3.get(i);
        }
        assertArrayEquals(ans1, pp1);
        assertArrayEquals(ans2, pp2);
        assertArrayEquals(ans3, pp3);
    }
}