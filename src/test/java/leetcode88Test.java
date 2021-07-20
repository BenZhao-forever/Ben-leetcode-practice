import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
class leetcode88Test {

    @Test
    void merge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] ans1 = {1, 2 ,2, 3, 5, 6};
        int[] nums3 = {0};
        int[] nums4 = {1};
        int[] ans2 = {1};
        int[] nums5 = {1};
        int[] nums6 = {};
        int[] ans3 = {1};
        leetcode88.merge(nums1, 3, nums2, 3);
        assertArrayEquals(ans1, nums1);
        leetcode88.merge(nums3, 0, nums4, 1);
        assertArrayEquals(ans2, nums3);
        leetcode88.merge(nums5, 1, nums6, 0);
        assertArrayEquals(ans3, nums5);
    }
}