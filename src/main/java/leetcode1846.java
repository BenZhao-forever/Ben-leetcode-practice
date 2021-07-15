/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/14
 * Project: Ben-leetcode-practice
 */
public class leetcode1846 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging/", 1846);
    }
    public static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int[] map = new int[arr.length];
        int ans = 0;
        int miss = 0;
        for (int n: arr) {
            if (n >= arr.length) {
                map[arr.length - 1]++;
            }else if (n > 0) {
                map[n - 1]++;
            }
        }
        for (int i = map.length - 1; i >= 0 ; i--) {
            if (map[i] == 0) {
                if (miss == 0) {
                    ans++;
                }else {
                    miss--;
                }
            }else {
                miss += map[i] - 1;
            }
        }
        return map.length - ans;
    }
}
