import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/19
 * Project: Ben-leetcode-practice
 */
public class Solution {
    public static void main(String[] args) {

    }
    public static int removeProduct(int num, ArrayList<Integer> ids, int rem) {
        if (num == 0 || rem >= num) {
            return 0;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (Integer id: ids) {
            if (hashMap.containsKey(id)) {
                hashMap.put(id, hashMap.get(id) + 1);
            }else {
                hashMap.put(id, 1);
            }
        }
        PriorityQueue<Integer> mincount = new PriorityQueue<>();
        mincount.addAll(hashMap.values());
        while (!mincount.isEmpty()) {
            int count = mincount.poll();
            if (count > rem) {
                return mincount.size() + 1;
            }else {
                rem -= count;
            }
            if (rem == 0) {
                return mincount.size();
            }
        }
        return 0;
    }
}
