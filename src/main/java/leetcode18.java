import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/23
 * Project: Ben-leetcode-practice
 */
public class leetcode18 {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i > 3) {
                sum -= nums[i - 4];
                if (sum == target) {
                    List<Integer> temp = new ArrayList<>();
                    for (int j = 3; j >= 0; j--) {
                        temp.add(nums[i - j]);
                    }
                    answer.add(temp);
                }
            }
        }
        return answer;
    }
}
