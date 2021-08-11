import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class leetcode17Test {

    @Test
    void letterCombinations() {
        List<String> list1 = leetcode17.letterCombinations("23");
        List<String> list2 = leetcode17.letterCombinations("235");
        print(list1);
        print(list2);
    }
    public static void print(List<String> list) {
        for (String n : list) {
            System.out.print(n + ", ");
        }
    }
}