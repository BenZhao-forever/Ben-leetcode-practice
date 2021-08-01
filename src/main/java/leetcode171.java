public class leetcode171 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/excel-sheet-column-number/submissions/", 171);
    }
    public static int titleToNumber(String columnTitle) {
        int number = 0;
        for (int i = columnTitle.length() - 1; i >= 0 ; i--) {
            number += (columnTitle.charAt(i) - 'A' + 1) * Math.pow(26, columnTitle.length() - i - 1);
        }
        return number;
    }
}
