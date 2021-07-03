import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/3
 * Project: Ben-leetcode-practice
 */
public class leetcode645 {
    public static void main(String[] args) {
    }
    public static int[] findErrorNums(int[] nums) {
        int[] answer = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for (int n: nums) {
            if (set.contains(n)) {
                answer[0] = n;
            }else {
                set.add(n);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i + 1)) {
                answer[1] = i + 1;
            }
        }
        return answer;
    }
}
