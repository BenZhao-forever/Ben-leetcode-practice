import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/25
 * Project: Ben-leetcode-practice
 */
public class leetcode1713 {
    public static void main(String[] args) {

    }
    public static int minOperations(int[] target, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            map.put(target[i], i);
        }
        List<Integer> list = new ArrayList<>();
        for (int k : arr) {
            if (map.containsKey(k)) {
                list.add(k);
            }
        }
        if (list.size() == 0) {
            return 0;
        }
        int preindex;
        int maxsubsequence = 1;
        for (int i = list.size() - 1; i >= 0; i--) {
            preindex = i;
            int temp = 1;
            if (maxsubsequence > i) {
                break;
            }
            for (int j = i - 1; j >= 0; j--) {
                if (map.get(list.get(j)) < map.get(list.get(preindex))) {
                    maxsubsequence++;
                }
            }
            maxsubsequence = Math.max(temp, maxsubsequence);
        }
        return target.length - maxsubsequence;
    }
}
