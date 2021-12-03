import java.util.Arrays;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/12/3
 * Project: Ben-leetcode-practice
 */
public class leetcode594 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/longest-harmonious-subsequence/",594);
    }
    public static int findLHS(int[] nums){
        if (nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;
        int last = nums[0];
        int j = 0;
        for (int i = 1 ; i < nums.length ; i++) {
            if (Math.abs(nums[i] - nums[j]) == 1) {
                int tempi = i;
                while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                    i++;
                }
               max = Math.max(max, i - j + 1);
               j = tempi;
            }
            if (nums[i] != nums[j]) {
                j = i;
            }
        }
        return max;
    }
}
