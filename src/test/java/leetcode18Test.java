import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/23
 * Project: Ben-leetcode-practice
 */
class leetcode18Test {

    @Test
    void fourSum() {
        List<List<Integer>> list = leetcode18.fourSum(new int[] {1,0,-1,0,-2,2}, 0);
        int[][] l1 = new int[list.size()][list.get(0).size()];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(0).size(); j++) {
                l1[i][j] = list.get(i).get(j);
            }
        }
        assertArrayEquals(new int[][] {{-2,-1,1,2},{-2,0,0,2},{-1,0,0,1}}, l1);
    }
}