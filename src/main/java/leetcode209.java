/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/20
 * Project: Ben-leetcode-practice
 */
public class leetcode209 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/minimum-size-subarray-sum/", 209);
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int answer = nums.length + 1;
        int sum = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum >= target) {
                answer = Math.min(answer, i - left + 1);
                while (sum >= target) {
                    answer = Math.min(answer, i - left + 1);
                    sum -= nums[left++];
                }
            }
        }
        return answer == nums.length + 1 ? 0 : answer;
    }
}
