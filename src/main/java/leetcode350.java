/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/22
 * Project: Ben-leetcode-practice
 */
public class leetcode350 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/intersection-of-two-arrays-ii/", 350);
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        if( nums1.length * nums2.length == 0) {
            return new int[] {};
        }
        int[] map = new int[1001];
        for (int n: nums1) {
            map[n]++;
        }
        int count = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (map[nums2[i]] == 0) {
                nums2[i] = 1001;
            }else {
                map[nums2[i]]--;
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
