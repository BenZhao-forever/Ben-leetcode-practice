import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/17
 * Project: Ben-leetcode-practice
 */
public class findaPair {
    public static void main(String[] args) {

    }
    public static List<int[]> findaPairFromTwo(int[] a, int[] b, int target) {
        List<int[]> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        if (a.length == 0 || b.length == 0) {
            return answer;
        }
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], i);
        }
        Arrays.sort(a);
        int[][] temp = new int[b.length][2];
        for (int i = 0; i < b.length; i++) {
            int indexa = binarySearch(a, target - b[i]);
            temp[i] = new int[] {indexa, i};
            if (indexa != -1) {
                min = Math.min(min, target - a[indexa] - b[i]);
            }
        }
        for (int[] n: temp) {
            if (n[0] != -1 && target - a[n[0]] - b[n[1]] == min) {
                answer.add(new int[] {map.get(a[n[0]]), n[1]});
            }
        }
        return answer;
    }
    public static int binarySearch(int[] a, int target) {
        if (target < a[0]) {
            return -1;
        }
        int left = 0;
        int right = a.length -1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == target) {
                return mid;
            }
            if (a[mid] < target) {
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return a[right] > target ? right - 1: right;
    }


}
