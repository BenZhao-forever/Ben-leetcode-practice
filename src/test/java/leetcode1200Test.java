import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class leetcode1200Test {

    @Test
    void minimumAbsDifference() {
        List<List<Integer>> answer = leetcode1200.minimumAbsDifference(new int[] {4,2,1,3});
        System.out.println(answer.toString());
    }
}