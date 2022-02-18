public class leetcode389 {
    public static void main(String[] args) {

    }
    public static char findTheDifferents (String s, String t) {
        int[] map = new int[36];
        for (int i = 0; i < t.length(); i++) {
            if (i != s.length())
                map[s.charAt(i) - 'a']--;
            map[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 36; i++) {
            if (map[i] == 1) {
                return (char)(i + 'a');
            }
        }
        return 'a';
    }
}
