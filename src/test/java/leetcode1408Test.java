import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/15
 * Project: Ben-leetcode-practice
 */
class leetcode1408Test {

    @Test
    void stringMatching() {
        String[] list1 = {"mass","as","hero","superhero"};
        List<String> ans1 = new ArrayList<>();
        ans1.add("as");
        ans1.add("hero");
        String[] list2 = {"leetcode","et","code"};
        List<String> ans2 = new ArrayList<>();
        ans2.add("et");
        ans2.add("code");
        String[] list3 = {"blue","green","bu"};
        List<String> ans3 = new ArrayList<>();
        assertEquals(ans1, leetcode1408.stringMatching(list1));
        assertEquals(ans2, leetcode1408.stringMatching(list2));
        assertEquals(ans3, leetcode1408.stringMatching(list3));
    }
}