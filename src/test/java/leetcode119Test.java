import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class leetcode119Test {

    @Test
    void getRow() {
        List<Integer> list = leetcode119.getRow(5);
        for (Integer n: list) {
            System.out.print(n + " ");
        }
    }
}