import java.util.*;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/5
 * Project: Ben-leetcode-practice
 */
public class leetcode726 {
    public static void main(String[] args) {

    }
    public static String countOfAtoms(String formula) {
        return changeOrder(removeSpace(toLongForm(formula)));
    }
    public static String toLongForm(String formula) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < formula.length(); i++) {
            if (formula.charAt(i) == '(') {
                stack.push(i);
            }
            if (formula.charAt(i) == ')') {
                int count = 1;
                if (i + 1 < formula.length() && Character.isDigit(formula.charAt(i + 1))) {
                    count = getNumber(formula, i + 1);
                }
                formula = deleteParentheses(formula, stack.pop(), i, count);
            }
        }
        return formula;
    }
    public static String deleteParentheses(String formula, int start, int end, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        String pre = formula.substring(0, start);
        String sub = formula.substring(end + 1);
        StringBuilder mid = new StringBuilder(" ");
        for (int i = start + 1; i < end; i++) {
            if(Character.isUpperCase(formula.charAt(i))) {
                if (i + 1 < end) {
                    if(Character.isUpperCase(formula.charAt(i + 1)) || formula.charAt(i + 1) == ' ') {
                        mid.append(formula.charAt(i)).append(count);
                    }else if(Character.isDigit(formula.charAt(i + 1))) {
                        mid.append(formula.charAt(i)).append(count * getNumber(formula, i + 1));
                    }else {
                        int j = i + 1;
                        while (j < end && Character.isLowerCase(formula.charAt(j))) {
                            j++;
                        }
                        mid.append(formula, i, j);
                        if (j == end || Character.isUpperCase(formula.charAt(j)) || formula.charAt(j) == ' ') {
                            mid.append(count);
                        }else {
                            mid.append(count * getNumber(formula, j));
                        }
                    }
                }else {
                    mid.append(formula.charAt(i)).append(count);
                }
            }
        }
        mid.append(" ");
        stringBuilder.append(pre);
        stringBuilder.append(mid);
        stringBuilder.append(sub);
        return stringBuilder.toString();
    }
    public static int getNumber(String formula, int i) {
        int number = 0;
        while(i < formula.length() && Character.isDigit(formula.charAt(i))) {
            number *= 10;
            number += Character.getNumericValue(formula.charAt(i));
            i++;
        }
        return number;
    }
    public static String removeSpace(String formula) {
        StringBuilder stringBuilder = new StringBuilder(formula);
        for (int i = 0; i < formula.length(); i++) {
            if (formula.charAt(i) == ' ') {
                if (i + 1 < formula.length() && Character.isDigit(formula.charAt(i + 1))) {
                    int j = i + 1;
                    while (j < formula.length() && Character.isDigit(formula.charAt(j))) {
                        j++;
                    }
                    stringBuilder.replace(i, j, " ".repeat(Math.max(0, j - i)));
                }
            }
        }
        formula = stringBuilder.toString();
        formula = formula.replaceAll(" ", "");
        return formula;
    }

    public static String changeOrder(String formula) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < formula.length(); i++) {
            if (Character.isUpperCase(formula.charAt(i))) {
                String atom = "";
                int count = 1;
                int j = i;
                while (true) {
                    j++;
                    if (j == formula.length() || Character.isUpperCase(formula.charAt(j))) {
                        atom = formula.substring(i, j);
                        break;
                    }
                    if (Character.isDigit(formula.charAt(j))) {
                        atom = formula.substring(i, j);
                        count = getNumber(formula, j);
                        break;
                    }
                }
                if (map.containsKey(atom)) {
                    map.put(atom, count + map.get(atom));
                }else {
                    map.put(atom, count);
                }
            }
        }
        List<String> list = new ArrayList<String>();
        map.forEach((key, value) -> {
            if (value != 1) {
                list.add(key + Integer.toString(value));
            }else {
                list.add(key);
            }
        });
        list.sort(Comparator.naturalOrder());
        StringBuilder stringBuilder = new StringBuilder();
        for (String i: list) {
            stringBuilder.append(i);
        }
        return stringBuilder.toString();
    }
}
