public class leetcode151 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/reverse-words-in-a-string/submissions/", 151);
    }
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                int left = i;
                while (left != -1 && s.charAt(left) != ' ') {
                    left--;
                }
                sb.append(' ').append(s, left + 1, i + 1);
                i = left;
            }
        }
        return sb.substring(1);
    }
}
