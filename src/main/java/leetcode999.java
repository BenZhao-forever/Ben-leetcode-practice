/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/15
 * Project: Ben-leetcode-practice
 */
public class leetcode999 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/available-captures-for-rook/", 999);
    }
    public static int numRookCaptures(char[][] board) {
        int[] index = findR(board);
        int answer = 0;
        for (int i = index[1]; i < board.length; i++) {
            if (board[index[0]][i] == 'p') {
                answer++;
                break;
            }
            if (board[index[0]][i] == 'B'){
                break;
            }
        }
        for (int i = index[1]; i >= 0; i--) {
            if (board[index[0]][i] == 'p') {
                answer++;
                break;
            }
            if (board[index[0]][i] == 'B'){
                break;
            }
        }
        for (int i = index[0]; i < board[0].length; i++) {
            if (board[i][index[1]] == 'p') {
                answer++;
                break;
            }
            if (board[i][index[1]] == 'B'){
                break;
            }
        }
        for (int i = index[0]; i >=0; i--) {
            if (board[i][index[1]] == 'p') {
                answer++;
                break;
            }
            if (board[i][index[1]] == 'B'){
                break;
            }
        }
        return answer;
    }
    public static int[] findR(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
