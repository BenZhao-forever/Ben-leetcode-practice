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
        int min = -1;
        List<int[]> answer = new ArrayList<>();
        if (a.length == 0 || b.length == 0) {
            return answer;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], i);
        }
        Arrays.sort(a);
        for (int i = 0; i < b.length; i++) {
            if(b[i] + a[0] <= target) {
                int number = binarySearch(a, b[i] - target);
                answer.add(new int[] {number, i});
                min = Math.min(min, target - number - b[i]);
            }
        }
        List<int[]> newanswer = new ArrayList<>();
        for (int[] n: answer) {
            if (target - (n[0] + b[n[1]]) == 0 || target - (n[0] + b[n[1]]) == min) {
                n[0] = map.get(n[0]);
                newanswer.add(n);
            }
        }
        return newanswer;
    }
    public static int binarySearch(int[] a, int target) {
        if (a[a.length - 1] <= target) {
            return a[a.length - 1];
        }
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == target) {
                return a[mid];
            }
            if (a[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return a[left];
    }
}
