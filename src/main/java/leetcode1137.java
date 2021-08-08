public class leetcode1137 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/n-th-tribonacci-number/submissions/", 1137);
    }
    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 1;
        for (int i = 2; i < n; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return d;
    }
}
