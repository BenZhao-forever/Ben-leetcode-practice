import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class leetcode1337 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/submissions/", 1337);
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        Comparator<int[]> comparator = (pair1, pair2) -> {
            if (pair1[0] == pair2[0]) {
                return pair1[1] - pair2[1];
            }
            return pair1[0] - pair2[0];
        };
        Queue<int[]> queue = new PriorityQueue<>(comparator);
        for (int i = 0; i < mat.length; i++) {
            queue.add(new int[] {findSoldiers(mat[i]), i});
        }
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = Objects.requireNonNull(queue.poll())[1];
        }
        return answer;
    }
    public static int findSoldiers(int[] soldiers) {
        int left = 0;
        int right = soldiers.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (soldiers[mid] == 1) {
                if (soldiers[mid + 1] == 0) {
                    return mid + 1;
                }else {
                    left = mid + 1;
                }
            }else {
                right = mid - 1;
            }
        }
        return soldiers[0] == 0 ? 0 : left + 1;
    }
}
