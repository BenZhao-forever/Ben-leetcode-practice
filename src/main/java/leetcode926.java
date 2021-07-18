/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/18
 * Project: Ben-leetcode-practice
 */
public class leetcode926 {
    public static void main(String[] args) {
        //readMeSet.addnewline("", );
    }
    public static int minFlipsMonoIncr(String s) {
        int zeroes = 0;
        int ones = 0;
        int flips = 0;
        int flips2 = 0;
        boolean start = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zeroes++;
                if (start) {
                    flips++;
                }
            }else {
                start = true;
                ones++;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                flips2++;
            }else {
                break;
            }
        }
        return Math.min(Math.min(flips, ones - flips2), Math.min(ones, zeroes));
    }
}
