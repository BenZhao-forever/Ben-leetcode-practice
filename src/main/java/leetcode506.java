import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class leetcode506 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/relative-ranks/",506);
    }
    public static String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        int[] newscore = score.clone();
        Arrays.sort(newscore);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < score.length; i++) {
            map.put(newscore[i], score.length - i);
        }
        for (int i = 0; i < score.length; i++) {
            int s = map.get(score[i]);
            switch (s) {
                case 1:
                    result[i] = "Gold Medal";
                    break;
                case 2:
                    result[i] = "Silver Medal";
                    break;
                case 3:
                    result[i] = "Bronze Medal";
                    break;
                default:
                    result[i] = Integer.toString(s);
            }
        }
        return result;
    }
}
