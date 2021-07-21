import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/20
 * Project: Ben-leetcode-practice
 */
public class leetcode904 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/fruit-into-baskets/",904);
    }
    public static int totalFruit(int[] fruits) {
        if (fruits.length < 2) {
            return fruits.length;
        }
        int left = 0;
        int fruitB = 0;
        while (fruits[fruitB] == fruits[left]) {
            fruitB++;
            if (fruitB == fruits.length) {
                return fruits.length;
            }
        }
        int answer = 0;
        for (int i = fruitB; i < fruits.length; i++) {
            if (fruits[i] != fruits[left] && fruits[i] != fruits[fruitB]) {
                answer = Math.max(answer, i - left);
                left = i - 1;
                while (fruits[left] == fruits[i -1]) {
                    left --;
                }
                left++;
                fruitB = i;
            }
        }
        return Math.max(answer, Math.max(answer, fruits.length - left));
    }
}
