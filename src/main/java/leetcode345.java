import java.util.HashSet;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/29
 * Project: Ben-leetcode-practice
 */
public class leetcode345 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/reverse-vowels-of-a-string/", 345);
    }
    public static String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        while (left < right) {
            if (set.contains(s.charAt(left)) && set.contains(s.charAt(right))) {
                s = s.substring(0, left) + s.charAt(right) + s.substring(left + 1, right) + s.charAt(left) + s.substring(right + 1);
                left++;
                right--;
            }
            if (!set.contains(s.charAt(left))) {
                left++;
            }
            if (!set.contains(s.charAt(right))) {
                right--;
            }
        }
        return s;
    }
}
