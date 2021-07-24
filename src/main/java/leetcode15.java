import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/24
 * Project: Ben-leetcode-practice
 */
public class leetcode15 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/3sum/", 15);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        if (nums.length < 3) {
            return answer;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int right = nums.length - 1;
            int left = i + 1;
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] + nums[left] > 0) {
                continue;
            }
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> level = new ArrayList<>();
                    level.add(nums[i]);
                    level.add(nums[left]);
                    level.add(nums[right]);
                    answer.add(level);
                    while (left < right) {
                        left++;
                        right--;
                        if (nums[left] != nums[left - 1] || nums[right] != nums[right + 1]) {
                            break;
                        }
                    }
                }else if (sum < 0) {
                    left++;
                }else {
                    right--;
                }
            }
        }
        return answer;
    }
}
