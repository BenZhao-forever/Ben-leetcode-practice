/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/13
 * Project: Ben-leetcode-practice
 */
public class leetcode26 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/remove-duplicates-from-sorted-array/", 26);
    }
/*    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length + 1;
        }
        int left = 0;
        int right = 1;
        while (right != nums.length) {
            if(nums[right] > nums[left]) {
                nums[left + 1] = nums[right];
                left++;
                right++;
            }else {
                right++;
            }
        }
        return left + 1;
    }*/

    public static int removeDuplicates(int[] nums) {
        int right = 0;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            while (nums[i] == nums[right]) {
                right++;
                if (right >= nums.length) {
                    return count + 1;
                }
            }
            nums[i + 1] = nums[right];
            count++;
        }
        return count + 1;
    }

}
