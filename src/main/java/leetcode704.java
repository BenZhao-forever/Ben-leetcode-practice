/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/16
 * Project: Ben-leetcode-practice
 */
public class leetcode704 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/binary-search/", 704);
    }
    public static int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return nums[left] == target ? left : -1;
    }
}
