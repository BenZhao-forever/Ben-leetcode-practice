/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/22
 * Project: Ben-leetcode-practice
 */
public class leetcode349 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/intersection-of-two-arrays/", 349);
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length * nums2.length == 0) {
            return new int[]{};
        }
        int[] map = new int[1001];
        for (int n: nums1) {
            map[n] = 1;
        }
        int count = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (map[nums2[i]] == 0) {
                nums2[i] = 1001;
            }else {
                map[nums2[i]] = 0;
                count++;
            }
        }
        int[] answer = new int[count];
        for (int n: nums2) {
            if (n != 1001) {
                answer[--count] = n;
            }
        }
        return answer;
    }
}
