import java.util.ArrayList;
import java.util.List;

public class leetcode119 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/pascals-triangle-ii/", 119);
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        if (rowIndex == 0) {
            return row;
        }
        List<Integer> prerow = new ArrayList<>();
        prerow.add(1);
        prerow.add(1);
        for (int i = 2; i <= rowIndex; i++) {
            row = new ArrayList<>();
            row.add(1);
            for (int j = 0; j < i - 1; j++) {
                row.add(prerow.get(j) + prerow.get(j + 1));
            }
            row.add(1);
            prerow = row;
        }
        return prerow;
    }
}
