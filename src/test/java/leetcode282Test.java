import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class leetcode282Test {

    @Test
    void addOperators() {
        List<String> list1 = leetcode282.addOperators("123", 6);
        List<String> list2 = leetcode282.addOperators("232", 8);
        List<String> list3 = leetcode282.addOperators("105", 5);
        List<String> list4 = leetcode282.addOperators("00", 0);
        List<String> list5 = leetcode282.addOperators("3456237490", 9191);
        System.out.println(list1.toString());
        System.out.println(list2.toString());
        System.out.println(list3.toString());
        System.out.println(list4.toString());
        System.out.println(list5.toString());
    }
}