import java.util.LinkedList;
import java.util.Queue;

public class leetcode542 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/01-matrix/", 542);
    }
    public static int[][] updateMatrix(int[][] met) {
        int m = met.length;
        int n = met[0].length;
        int[][] answer = new int[m][n];
        int[][] direction = new int[][] {{-1, 0},{1, 0},{0, -1},{0, 1}};
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] finish= new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (met[i][j] == 0) {
                    queue.add(new int[] {i, j});
                    finish[i][j] = true;
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] dir = queue.poll();
            int i = dir[0];
            int j = dir[1];
            for (int k = 0; k < 4; k++) {
                int ni = i + direction[k][0];
                int nj = j + direction[k][1];
                if (ni >= 0 && ni < m && nj >= 0 && nj < n && !finish[ni][nj]) {
                    answer[ni][nj] = answer[i][j] + 1;
                    queue.offer(new int[] {ni, nj});
                    finish[ni][nj] = true;
                }
            }
        }
        return answer;
    }
}
