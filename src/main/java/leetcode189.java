/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/15
 * Project: Ben-leetcode-practice
 */
public class leetcode189 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/rotate-array/", 189);
    }
    public static void rotate(int[] nums, int k) {
        if (nums.length < 2) {
            return;
        }
        k %= nums.length;
        if (k == 0) {
            return;
        }
        int[] temp = new int[nums.length];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[nums.length - k + i];
        }
        for (int i = k; i < nums.length; i++) {
            temp[i] = nums[i - k];
        }
        System.arraycopy(temp, 0, nums, 0, temp.length);
    }
}
