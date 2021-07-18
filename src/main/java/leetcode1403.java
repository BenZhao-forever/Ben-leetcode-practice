import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/18
 * Project: Ben-leetcode-practice
 */
public class leetcode1403 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/", 1403);
    }
    public static List<Integer> minSubsequence(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        if (nums.length == 0) {
            return answer;
        }
        Arrays.sort(nums);
        int sum = 0;
        for (int n: nums) {
            sum += n;
        }
        int presum = 0;
        int index = nums.length - 1;
        while (presum <= sum) {
            answer.add(nums[index]);
            sum -= nums[index];
            presum += nums[index];
            index--;
        }
        return answer;
    }
}
