/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/18
 * Project: Ben-leetcode-practice
 */
public class leetcode1925 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/count-square-sum-triples/", 1925);
    }
    public static int countTriples(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                double c = Math.sqrt(i * i + j * j);
                if (c % 1 == 0.0 && c <= n ) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
