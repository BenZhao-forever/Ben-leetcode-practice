public class leetcode541 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/reverse-string-ii/submissions/", 541);
    }
    public static String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        for (int i = 0; i <s.length() ; i += 2 * k) {
            int left = i;
            int right = Math.min(str.length - 1, i + k - 1);
            while (left < right) {
                char temp = str[left];
                str[left++] = str[right];
                str[right--] = temp;
            }
        }
        return new String(str);
    }
}
