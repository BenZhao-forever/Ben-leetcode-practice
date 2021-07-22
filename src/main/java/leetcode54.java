import java.util.ArrayList;
import java.util.List;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/20
 * Project: Ben-leetcode-practice
 */
public class leetcode54 {
    public static void main(String[] args) {

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < m - i - 1; j++) {
                answer.add(matrix[i][j]);
            }
            for (int j = i; j < n - i - 1; j++) {
                answer.add(matrix[j][m - i - 1]);
            }
            for (int j = m - i - 1; j > i; j--) {
                answer.add(matrix[n - i - 1][j]);
            }
            for (int j = n - i - 1; j > i; j--) {
                answer.add(matrix[j][i]);
            }
        }
        if (n % 2 == 1 && m % 2 == 1) {
            answer.add(matrix[n / 2][m / 2]);
            return answer;
        }
        if(n % 2 == 1) {
            for (int i = n / 2; i < m - n / 2; i++) {
                answer.add(matrix[n / 2][i]);
            }
        }else if (m % 2 == 1) {
            for (int i = n / 2; i < n - n / 2; i++) {
                answer.add(matrix[i][m/2]);
            }
        }
        return answer;
    }
}
