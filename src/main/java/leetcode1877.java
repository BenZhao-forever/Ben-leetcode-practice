import java.util.Arrays;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/19
 * Project: Ben-leetcode-practice
 */
public class leetcode1877 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/", 1877);
    }
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            max = Math.max(max, nums[i] + nums[nums.length - 1 - i]);
        }
        return max;
    }
}
