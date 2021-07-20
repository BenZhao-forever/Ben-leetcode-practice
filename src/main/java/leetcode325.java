import java.util.HashMap;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/20
 * Project: Ben-leetcode-practice
 */
public class leetcode325 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/", 325);
    }
    public static int maxSubArray(int[] nums, int k) {
        int answer = 0;
        int[] sum = new int[nums.length + 1];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 0);
        for (int i = 1; i <= nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
            if (!hashMap.containsKey(sum[i])) {
                hashMap.put(sum[i], i);
            }
        }
        for (int i = nums.length; i > answer; i--) {
            if(hashMap.containsKey(sum[i] - k)) {
                answer = Math.max(answer, i - hashMap.get(sum[i] - k));
            }
        }
        return answer;

    }
}
