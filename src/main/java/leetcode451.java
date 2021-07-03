import java.util.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/2
 * Project: Ben-leetcode-practice
 */
public class leetcode451 {
    public static void main(String[] args) {

    }
    public static String frequencySort(String s) {
        Queue<Character> q = new PriorityQueue<Character>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            q.add(s.charAt(i));
        }
        List<String> list = new ArrayList<String>();
        char n = q.peek();
        StringBuilder temp = new StringBuilder();
        while(!q.isEmpty()) {
            if (q.peek() == n) {
                temp.append(q.poll());
            }else {
                list.add(temp.toString());
                temp = new StringBuilder();
                n = q.peek();
            }
        }
        list.add(temp.toString());
        String max = "";
        while(!list.isEmpty()) {
            for (String str: list) {
                if (str.length() >= max.length()) {
                    max = str;
                }
            }
            stringBuilder.append(max);
            list.remove(max);
            max = "";
        }

        return stringBuilder.toString();
    }
}
