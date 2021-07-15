/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/15
 * Project: Ben-leetcode-practice
 */
public class leetcode34 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/", 34);
    }
    public static int[] searchRange(int[] nums, int target) {
        return new int[] {binarySearch(nums, target, true), binarySearch(nums, target, false)};
    }
    public static int binarySearch(int[] nums, int target, boolean left) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                if (left) {
                    if (mid == 0 || nums[mid -1] != target) {
                        return mid;
                    }else {
                        r = mid;
                    }
                }else {
                    if (mid == nums.length - 1 || nums[mid + 1] != target) {
                        return mid;
                    }
                    else {
                        l = mid + 1;
                    }
                }
            }else if (nums[mid] < target) {
                l = mid + 1;
            }else {
                r = mid;
            }
        }
        return -1;
    }
}
