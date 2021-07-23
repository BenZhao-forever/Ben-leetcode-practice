/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/23
 * Project: Ben-leetcode-practice
 */
public class leetcode1736 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/latest-time-by-replacing-hidden-digits/", 1736);
    }
    public static String maximumTime(String time) {
        char[] times = time.toCharArray();
        if (times[4] == '?') {
            if (times[3] == '?') {
                times[3] = '5';
            }
            times[4] = '9';
        }
        if (times[3] == '?') {
            times[3] = '5';
        }
        if (times[1] == '?') {
            if (times[0] == '?') {
                times[0] = '2';
                times[1] = '3';
            }else if (times[0] == '2') {
                times[1] = '3';
            }else {
                times[1] = '9';
            }
        }
        if (times[0] == '?') {
            if (times[1] == '0' || times[1] == '1' || times[1] == '2' || times[1] == '3') {
                times[0] = '2';
            }else {
                times[0] = '1';
            }
        }
        return String.valueOf(times);
    }
}
