/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/20
 * Project: Ben-leetcode-practice
 */
public class leetcode59 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/spiral-matrix-ii/", 59);
    }
    public static int[][] generateMatrix(int n) {
        int[][] answer = new int[n][n];
        int number = 1;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                answer[i][j] = number++;
            }
            for (int j = i; j < n - i - 1; j++) {
                answer[j][n - i - 1] = number++;
            }
            for (int j = n - i - 1; j > i; j--) {
                answer[n - i - 1][j] = number++;
            }
            for (int j = n - i - 1; j > i; j--) {
                answer[j][i] = number++;
            }
        }
        if (n % 2 == 1) {
            answer[n/2][n/2] = number;
        }
        return answer;
    }
}
