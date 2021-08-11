import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode17 {
    public static void main(String[] args) {

    }
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.length() == 0) {
            return list;
        }
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backtrack(list, map, digits, 0, new StringBuilder());
        return list;
    }
    public static void backtrack(List<String> list, Map<Character, String> map, String digits, int index, StringBuilder sb) {
        if (index == digits.length()) {
            list.add(sb.toString());
        }else {
            char digit = digits.charAt(index);
            String letters = map.get(digit);
            int lettersCount = letters.length();
            for (int i = 0; i < lettersCount; i++) {
                sb.append((letters.charAt(i)));
                backtrack(list, map, digits, index + 1, sb);
                sb.deleteCharAt(index);
            }
        }
    }
}
