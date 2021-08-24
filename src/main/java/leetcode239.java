import java.util.Comparator;
import java.util.PriorityQueue;

public class leetcode239 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/sliding-window-maximum/", 239);
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<int []> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o2[0] - o1[0] : o2[1] - o1[1];
            }
        });
        for (int i = 0; i < k; i++) {
            pq.offer(new int[] {nums[i], i});
        }
        int[] answer = new int[n - k + 1];
        answer[0] = pq.peek()[0];
        for (int i = k; i < n; i++) {
            pq.offer(new int[] {nums[i], i});
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }
            answer[i - k + 1] = pq.peek()[0];
        }
        return answer;
    }
}
