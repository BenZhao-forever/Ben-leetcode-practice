import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/20
 * Project: Ben-leetcode-practice
 */
class leetcode59Test {

    @Test
    void generateMatrix() {
        int[][] list1 = leetcode59.generateMatrix(3);
        int[][] list2 = leetcode59.generateMatrix(4);
        int[][] list3 = leetcode59.generateMatrix(5);
        print(list1);
        print(list2);
        print(list3);
    }
    public static void print(int[][] list) {
        for (int[] ints : list) {
            for (int j = 0; j < list.length; j++) {
                System.out.print(ints[j] + "|");
            }
            System.out.println();
        }
    }
}