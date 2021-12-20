import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode1200 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/minimum-absolute-difference/", 1200);
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> answer = new ArrayList<>();
        if (arr.length < 2) {
            return new ArrayList<>();
        }
        Arrays.sort(arr);
        int minabsdif = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int abs = Math.abs(arr[i] - arr[i - 1]);
            if (abs <= minabsdif) {
                if (abs < minabsdif) {
                    answer = new ArrayList<>();
                }
                List<Integer> level = new ArrayList<>();
                level.add(arr[i - 1]);
                level.add(arr[i]);
                answer.add(level);
                minabsdif = abs;
            }
        }
        return answer;
    }
}
