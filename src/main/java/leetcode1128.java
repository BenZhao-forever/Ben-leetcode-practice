import java.util.Arrays;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/19
 * Project: Ben-leetcode-practice
 */
public class leetcode1128 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/number-of-equivalent-domino-pairs/", 1128);
    }
    public static int numEquivDominoPairs(int[][] dominoes) {
        int answer = 0;
        int[][] map = new int[10][10];
        for (int[] dominoe : dominoes) {
            int small = Math.min(dominoe[0], dominoe[1]);
            int large = Math.max(dominoe[0], dominoe[1]);
            answer += map[small][large];
            map[small][large]++;
        }
        return answer;
    }
}
