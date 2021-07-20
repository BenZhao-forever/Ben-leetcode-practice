import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/19
 * Project: Ben-leetcode-practice
 */
class SolutionTest {

    @Test
    void removeProduct() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(2);
        //assertEquals(2, Solution.removeProduct(6, list1, 2));
        //assertEquals(1, Solution.removeProduct(6, list1, 3));
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        list2.add(5);
        list2.add(5);
        assertEquals(1, Solution.removeProduct(4, list2, 2));
    }
}