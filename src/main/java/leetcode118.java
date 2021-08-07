import java.util.ArrayList;
import java.util.List;

public class leetcode118 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/pascals-triangle/", 118);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> level = new ArrayList<>();
        level.add(1);
        answer.add(level);
        if (numRows == 1) {
            return answer;
        }
        level = new ArrayList<>();
        level.add(1);
        level.add(1);
        answer.add(level);
        for (int i = 2; i < numRows; i++) {
            level = new ArrayList<>();
            level.add(1);
            for (int j = 0; j < i - 1; j++) {
                level.add(answer.get(i - 1).get(j + 1) + answer.get(i - 1).get(j));
            }
            level.add(1);
            answer.add(level);
        }
        return answer;
    }
}
