/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/12
 * Project: Ben-leetcode-practice
 */
public class leetcode53 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/maximum-subarray/", 53);
    }
    public static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for(int n: nums) {
            if(sum > 0) {
                sum += n;
            } else {
                sum = n;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
