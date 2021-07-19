/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/19
 * Project: Ben-leetcode-practice
 */
public class leetcode1122 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/relative-sort-array/submissions/", 1122);
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] answer = new int[arr1.length];
        int[] map = new int[1001];
        int max = 0;
        for (int n: arr1) {
            map[n]++;
            max = Math.max(max, n);
        }
        int index = 0;
        for (int k : arr2) {
            for (int j = 0; j < map[k]; j++) {
                answer[index + j] = k;
            }
            index += map[k];
            map[k] = 0;
        }
        for (int i = 0; i < max + 1; i++) {
            if (map[i] != 0) {
                for (int j = 0; j < map[i]; j++) {
                    answer[index + j] = i;
                }
                index += map[i];
            }
        }
        return answer;
    }
}
