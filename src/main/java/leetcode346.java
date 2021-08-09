import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode346 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/moving-average-from-data-stream/", 346);
    }
}
class MovingAverage {
    private int size;
    List<Integer> list = new ArrayList<>();
    public MovingAverage(int size) {
        this.size = size;
    }
    public double next(int val) {
        list.add(val);
        int sum = 0;
        int count = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            sum += list.get(i);
            count++;
            if (count == size) {
                return (double)sum/count;
            }
        }
        return (double)sum/count;
    }
}
