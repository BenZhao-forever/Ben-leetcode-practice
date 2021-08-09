import java.util.HashMap;
import java.util.Stack;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/6/23
 * Project: Ben-leetcode-practice
 */
public class leetcode20 {
    public static void main(String[] args) {

    }
//    public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (stack.isEmpty() || s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
//                stack.push(s.charAt(i));
//            }else{
//                char compare = stack.pop();
//                if (s.charAt(i) == ')' && compare == '(') {}
//                else if (s.charAt(i) == ']' && compare == '[') {}
//                else if (s.charAt(i) == '}' && compare == '{') {}
//                else {
//                    return false;
//                }
//            }
//        }
//        return stack.isEmpty();
//    }
    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')' , '(');
        map.put(']' , '[');
        map.put('}' , '{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (stack.isEmpty() || stack.pop() != map.get(s.charAt(i))) {
                    return false;
                }
            }else {
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }
}
