import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class leetcode22Test {

    @Test
    void generateParenthesis() {
        List<String> list = leetcode22.generateParenthesis(3);
        for (String l : list) {
            System.out.println(l);
        }
    }
}