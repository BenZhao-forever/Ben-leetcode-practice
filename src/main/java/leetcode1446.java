public class leetcode1446 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/consecutive-characters/",1446);
    }
    public static int maxPower(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        int length = 0;
        int temp = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                length = Math.max(length, temp + 1);
                temp = 0;
            }else {
                temp++;
            }
        }

        return Math.max(length, temp + 1);
    }
}
