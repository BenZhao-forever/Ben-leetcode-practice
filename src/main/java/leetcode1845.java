import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/19
 * Project: Ben-leetcode-practice
 */
public class leetcode1845 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/seat-reservation-manager/", 1845);
    }
    public Queue<Integer> heap;
    public void SeatManager(int n) {
        heap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            heap.add(i + 1);
        }
    }
    public int reserve() {
        return heap.poll();
    }
    public void unreserve(int seatNumber) {
        heap.add(seatNumber);
    }

}
