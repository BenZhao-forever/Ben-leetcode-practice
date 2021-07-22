import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/22
 * Project: Ben-leetcode-practice
 */
class leetcode1213Test {

    @Test
    void arraysIntersection() {
        List<Integer> list1 = leetcode1213.arraysIntersection(new int[] {1,2,3,4,5}, new int[] {1,2,5,7,9}, new int[] {1,3,4,5,8});
        List<Integer> list2 = leetcode1213.arraysIntersection(new int[] {197,418,523,876,1356}, new int[] {501,880,1593,1710,1870}, new int[] {521,682,1337,1395,1764});
        int[] l1 = new int[list1.size()];
        int[] l2 = new int[list2.size()];
        for (int i = 0; i < l1.length; i++) {
            l1[i] = list1.get(i);
        }
        for (int i = 0; i < l2.length; i++) {
            l2[i] = list2.get(i);
        }
        assertArrayEquals(new int[] {1, 5}, l1);
        assertArrayEquals(new int[] {}, l2);
    }
}