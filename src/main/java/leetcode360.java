/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/20
 * Project: Ben-leetcode-practice
 */
public class leetcode360 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/sort-transformed-array/", 360);
    }
    public static int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        int left = 0;
        int right = nums.length - 1;
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int leftval = a * nums[left] * nums[left] + b * nums[left] + c;
            int rightval = a * nums[right] * nums[right] + b * nums[right] + c;
            if (a > 0) {
                if (leftval < rightval) {
                    answer[nums.length - 1 - i] = rightval;
                    right--;
                }else {
                    answer[nums.length - 1 - i] = leftval;
                    left++;
                }
            }else {
                if (leftval < rightval) {
                    answer[i] = leftval;
                    left++;
                }else {
                    answer[i] = rightval;
                    right--;
                }
            }
        }
        return answer;
    }
}
