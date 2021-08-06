public class leetcode509 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/fibonacci-number/", 509);
    }
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
