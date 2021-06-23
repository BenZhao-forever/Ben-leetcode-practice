/**
 * @author benjakezhao
 */
public class leetcode7 {
    public static void main(String[] args) {

    }
    public static int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        int answer = 0;
        while (x != 0) {
            if (answer > 214748364 || answer < -214748364) {
                return 0;
            }
            if (answer == 214748364 && x > 7) {
                return 0;
            }
            if (x < -8 && answer == -214748364) {
                return 0;
            }
            int digit = x % 10;
            answer = answer * 10 + digit;
            x /= 10;

        }
        return answer;
    }
}
