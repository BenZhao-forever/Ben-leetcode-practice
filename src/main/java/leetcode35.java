/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/13
 * Project: Ben-leetcode-practice
 */
public class leetcode35 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/search-insert-position/", 35);
    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
