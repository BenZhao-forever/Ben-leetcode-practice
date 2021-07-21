/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/20
 * Project: Ben-leetcode-practice
 */
public class leetcode718 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/maximum-length-of-repeated-subarray/", 718);
    }
    public static int findLength(int[] nums1, int[] nums2) {
        int answer = 0;
        int n = nums1.length;
        int m = nums2.length;
        for (int i = 0; i < n ; i++) {
            int len = Math.min (m, n - i);
            answer = Math.max(answer, findmax(nums1, nums2, i, 0, len));
        }
        for (int i = 0; i < m ; i++) {
            int len = Math.min (n, m - i);
            answer = Math.max(answer, findmax(nums1, nums2, 0, i, len));
        }
        return answer;
    }
    public static int findmax(int[] nums1, int[] nums2, int a, int b, int len) {
        int answer = 0;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if(nums1[a + i] == nums2[b + i]) {
                count++;
            }else {
                count = 0;
            }
            answer = Math.max(count, answer);
        }
        return answer;
    }
}
