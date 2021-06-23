public class leetcode9 {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int compare = reverse(x);
        return (x == compare);
    }
    public static int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return reverse;
    }
}
