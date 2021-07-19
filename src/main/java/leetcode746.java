/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/19
 * Project: Ben-leetcode-practice
 */
public class leetcode746 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/min-cost-climbing-stairs/", 746);
    }
    public static int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        return Math.min(cost[cost.length - 2], cost[cost.length - 1]);
    }

}
