import java.util.HashMap;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/6/24
 * Project: Ben-leetcode-practice
 */
public class leetcode3 {
    public static void main(String[] args) {

    }
    public static int lengthOfLongestSubstring(String s) {
        int answer = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int preindex = 0;
        int tempanswer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                answer = Math.max(answer, tempanswer);
                int index = map.get(s.charAt(i));
                while (preindex != index) {
                    map.remove(s.charAt(preindex));
                    preindex++;
                    tempanswer--;
                }
                preindex++;
            } else {
                tempanswer++;
            }
            map.put(s.charAt(i), i);
        }
        return Math.max(answer, tempanswer);
    }

}
