import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/24
 * Project: Ben-leetcode-practice
 */
public class leetcode1743 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/", 1743);
    }
    public static int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>> map= new HashMap<>();
        for (int[] pair : adjacentPairs) {
            map.putIfAbsent(pair[0], new ArrayList<>());
            map.putIfAbsent(pair[1], new ArrayList<>());
            map.get(pair[0]).add(pair[1]);
            map.get(pair[1]).add(pair[0]);
        }
        int n = adjacentPairs.length + 1;
        int[] ret = new int[n];
        for(Map.Entry<Integer, List<Integer>> entry: map.entrySet()) {
            int e = entry.getKey();
            List<Integer> adj = entry.getValue();
            if (adj.size() == 1) {
                ret[0] = e;
                break;
            }
        }
        ret[1] = map.get(ret[0]).get(0);
        for (int i = 2; i < n; i++) {
            List<Integer> adj = map.get(ret[i - 1]);
            ret[i] = ret[i - 2] == adj.get(0) ? adj.get(1) : adj.get(0);
        }
        return ret;
    }
}
