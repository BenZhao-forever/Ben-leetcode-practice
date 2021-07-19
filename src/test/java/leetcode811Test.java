import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/18
 * Project: Ben-leetcode-practice
 */
class leetcode811Test {

    @Test
    void subdomainVisits() {
        String[] list1 = {"9001 discuss.leetcode.com"};
        String[] list2 = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        String[] ans1 = {"9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"};
        String[] ans2 = {"901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"};
        Arrays.sort(ans1);
        Arrays.sort(ans2);
        String[] expected1 = leetcode811.subdomainVisits(list1).toArray(new String[0]);
        String[] expected2 = leetcode811.subdomainVisits(list2).toArray(new String[0]);
        Arrays.sort(expected1);
        Arrays.sort(expected2);
        assertArrayEquals(ans1, expected1);
        assertArrayEquals(ans2, expected2);
    }
}