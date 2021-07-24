import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/24
 * Project: Ben-leetcode-practice
 */
class leetcode49Test {

    @Test
    void groupAnagrams() {
        List<List<String>> list = leetcode49.groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"});
        for (List<String> n: list) {
            System.out.print("{ ");
            for (String str: n) {
                System.out.print(str + ", ");
            }
            System.out.print("} , ");
        }

    }
}