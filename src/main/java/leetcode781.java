import java.util.HashMap;
import java.util.Map;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/4
 * Project: Ben-leetcode-practice
 */
public class leetcode781 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/rabbits-in-forest/", 781);
    }
    public static int numRabbits(int[] answers) {
        if (answers.length == 0) {
            return 0;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int n: answers) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            }else {
                map.put(n, 1);
            }
        }
        return getRabbits(map);
    }

    public static int getRabbits(HashMap<Integer, Integer> map) {
        int rabbits = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() == 1 || entry.getKey() >= entry.getValue() - 1) {
                rabbits += entry.getKey() + 1;
            }else {
                int divided = entry.getValue() / (entry.getKey() + 1);
                int rest = entry.getValue() % (entry.getKey() + 1) == 0 ? 0 : 1;
                rabbits += (divided + rest) * (entry.getKey() + 1);
            }
        }
        return rabbits;
    }
}
