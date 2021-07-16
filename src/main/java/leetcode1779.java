import java.util.HashMap;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/15
 * Project: Ben-leetcode-practice
 */
public class leetcode1779 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/", 1779);
    }
    public static int nearestValidPoint(int x, int y, int[][] points) {
        HashMap<Integer, Integer> distance = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = points.length - 1; i >= 0 ; i--) {
            int dis = -1;
            if (points[i][0] == x) {
                dis = Math.abs(points[i][1] - y);
            }else if (points[i][1] == y) {
                dis = Math.abs(points[i][0] - x);
            }
            if (dis != -1) {
                distance.put(dis, i);
                min = Math.min(min, dis);
            }
        }
        if (distance.isEmpty()) {
            return -1;
        }
        return distance.get(min);
    }
}
