import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/22
 * Project: Ben-leetcode-practice
 */
public class leetcode915 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/partition-array-into-disjoint-intervals/", 915);
    }
/*    public static int partitionDisjoint(int[] nums) {
        int max = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        for (int n: nums) {
            queue.offer(n);
        }
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max,nums[i]);
            queue.remove(nums[i]);
            if (queue.peek() >= max) {
                return i + 1;
            }
        }
        return 0;
    }*/

    public static int partitionDisjoint(int[] nums) {
        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        int ax = 0;
        int in = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max[i] = Math.max(ax, nums[i]);
            ax = max[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            min[i] = Math.min(in, nums[i]);
            in = min[i];
        }
        for (int i = 1; i < nums.length; i++) {
            if (min[i] >= max[i - 1]) {
                return i;
            }
        }
        return 0;
    }
}
