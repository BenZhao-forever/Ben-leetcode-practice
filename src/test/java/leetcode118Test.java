import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class leetcode118Test {

    @Test
    void generate() {
        List<List<Integer>> list = leetcode118.generate(5);
        for (List<Integer> l: list) {
            for (Integer i: l) {
                System.out.print(i + ",");
            }
            System.out.println();
        }
    }
}