import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/24
 * Project: Ben-leetcode-practice
 */
class leetcode15Test {

    @Test
    void threeSum() {
        List<List<Integer>> list1 = leetcode15.threeSum(new int[] {-1, 0, 1, 2, -1, -4});
        for (List<Integer> level: list1) {
            System.out.print("{");
            for (Integer i: level) {
                System.out.print(i + ", ");
            }
            System.out.print("}, ");
        }
    }
}