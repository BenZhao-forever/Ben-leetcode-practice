import java.util.ArrayList;
import java.util.List;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
public class leetcode88 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/merge-sorted-array/", 88);
    }
/*    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();
        int pointer1 = 0;
        int pointer2 = 0;
        while (pointer1 != m && pointer2 != n ) {
            if (nums1[pointer1] < nums2[pointer2]) {
                list.add(nums1[pointer1]);
                pointer1++;
            }else {
                list.add(nums2[pointer2]);
                pointer2++;
            }
        }
        if (pointer1 != m) {
            for (int i = pointer1; i < m; i++) {
                list.add(nums1[i]);
            }
        }
        if (pointer2 != n) {
            for (int i = pointer2; i < n; i++) {
                list.add(nums2[i]);
            }
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = list.get(i);
        }
    }*/
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int left = m - 1;
        int right = n - 1;
        int i = m + n - 1;
        int cur;
        while (left >= 0 || right >= 0) {
            if (left < 0) {
                cur = nums2[right];
                right--;
            }else if (right < 0) {
                cur = nums1[left];
                left--;
            }else if (nums1[left] < nums2[right]) {
                cur = nums2[right];
                right--;
            }else{
                cur = nums1[left];
                left--;
            }
            nums1[i] = cur;
            i--;
        }
    }
}
