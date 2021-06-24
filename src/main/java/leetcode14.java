/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/6/23
 * Project: Ben-leetcode-practice
 */
public class leetcode14 {
    public static void main(String[] args) {

    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        if (strs.length == 0) {
            return stringBuilder.toString();
        }
        if (strs.length == 1) {
            return strs[0];
        }
        if (strs[0].length() > strs[1].length()) {
            String temp = strs[0];
            strs[0] = strs[1];
            strs[1] = temp;
        }
        stringBuilder.append(findCommonPrefix(strs[0], strs[1]));
        for (int i = 2; i < strs.length ; i++) {
            stringBuilder.replace(0,stringBuilder.length(), findCommonPrefix(stringBuilder.toString(), strs[i]));
        }
        return stringBuilder.toString();
    }
    public static String findCommonPrefix(String str1, String str2) {
        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                stringBuilder.append(str1.charAt(i));
            }else {
                return stringBuilder.toString();
            }
        }
        return stringBuilder.toString();
    }
}
