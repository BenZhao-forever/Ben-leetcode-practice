import java.util.*;

public class leetcode1646 {
    public static void main(String[] args) {

    }
    public static HashMap<Integer,Integer> getMaximumGenerated(int n) {
//        if (n <= 1) {
//            return n;
//        }
//        if (n == 2) {
//            return 1;
//        }
        n = n % 2 == 0 ? n - 1 : n;
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        LinkedHashMap<Integer, Integer> set = new LinkedHashMap<>();
        set.put(n, 1);
        while (!q.isEmpty() && q.peek() != 1) {
            int number = q.poll();
            if (number % 2 == 1) {
                if (!set.containsKey(number / 2 + 1)) {
                    q.add(number / 2 + 1);
                    set.put(number / 2 + 1, 1);
                }
            }
            if (!set.containsKey(number / 2)) {
                q.add(number / 2);
                set.put(number / 2, 1);
            }
        }
        ListIterator<Map.Entry> it = new ArrayList<Map.Entry>(set.entrySet()).listIterator(set.size());
        int a = 0;

        while (it.hasPrevious()) {
            Map.Entry entry = it.previous();
            int key = (int) entry.getKey();
            int value = (int) entry.getValue();
            if (key != 1) {
                if (key % 2 == 0) {
                    set.put(key, set.get(key / 2));
                }else {
                    set.put(key, set.get(key / 2) + set.get(key / 2 + 1));
                }
            }
        }
        //return set.get(n);
        return set;
    }
}
