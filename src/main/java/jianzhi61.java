/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/15
 * Project: Ben-leetcode-practice
 */
public class jianzhi61 {
    public static void main(String[] args) {
    }
    public static boolean isStraight(int[] nums) {
        int min = 14;
        for (int n: nums) {
            if (n != 0) {
                min = Math.min(n, min);
            }
        }
        int[] map = new int[6];
        for (int n: nums) {
            if(n != 0) {
                if (n - min >= 5) {
                    return false;
                }
                if (map[n - min] == 1) {
                    return false;
                }
                map[n - min]++;
            }
        }
        return true;
    }
}
