import java.util.HashMap;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/29
 * Project: Ben-leetcode-practice
 */
public class leetcode454 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/4sum-ii/", 454);
    }
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for (int n: nums1) {
            for (int m: nums2) {
                map.put(n + m, map.getOrDefault(n + m, 0) + 1);
            }
        }
        for (int n: nums3) {
            for (int m: nums4) {
                if (map.containsKey(- n - m)) {
                    answer += map.get(- n - m);
                }
            }
        }
        return answer;
    }
}
