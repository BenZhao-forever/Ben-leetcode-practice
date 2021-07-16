/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/16
 * Project: Ben-leetcode-practice
 */
public class leetcode702 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/search-in-a-sorted-array-of-unknown-size/", 702);
    }
    public static int search(ArrayReader reader, int target) {
        if (reader.get(0) == Integer.MAX_VALUE) {
            return -1;
        }
        int left = 0;
        int right = 10000;
        if (reader.get(0) > 0) {
            right = 10000 - reader.get(0);
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (reader.get(mid) == target) {
                return mid;
            }
            if (reader.get(mid) < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        if (reader.get(left) == target) {
            return left;
        }
        return -1;
    }

}
