/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/20
 * Project: Ben-leetcode-practice
 */
public class leetcode977 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/squares-of-a-sorted-array/", 977);
    }
    public static int[] sortedSquares(int[] nums) {
        int[] answer = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];
            if (l < r) {
                answer[i] = r;
                right--;
            }else {
                answer[i] = l;
                left++;
            }
        }
        return answer;
    }
}
