import java.util.ArrayList;
import java.util.List;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/13
 * Project: Ben-leetcode-practice
 */
public class leetcode66 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/plus-one/", 66);
    }
    public static int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        digits[digits.length-1] += 1;
        for (int i = digits.length - 1; i >= 0 ;i--) {
            int sum = digits[i] + count;
            if(sum >= 10) {
                count = 1;
                sum %= 10;
            }else {
                count = 0;
            }
            list.add(sum);
        }
        if (count == 1) {
            list.add(1);
        }
        int[] ans = new int[list.size()];
        for (int i = list.size() - 1; i >= 0; i--) {
            ans[list.size() - i - 1] = list.get(i);
        }
        return ans;
    }
}
