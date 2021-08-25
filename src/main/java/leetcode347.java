import java.util.*;

public class leetcode347 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/top-k-frequent-elements/", 347);
    }
    public static int[] topKFrequent(int[] nums, int k) {
        int[] list = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);
        }
        List<List<Integer>> tank = new ArrayList<List<Integer>>();
        for (int i = 0; i <= nums.length; i++) {
            tank.add(new ArrayList<Integer>());
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            tank.get(entry.getValue()).add(entry.getKey());
        }
        int j = 0;
        for (int i = tank.size() - 1; i >= 0; i--) {
            if (tank.get(i).size() != 0) {
                for (Integer n: tank.get(i)) {
                    list[j++] = n;
                    if (j == k) {
                        return list;
                    }
                }
            }
        }
        return list;
    }
}
