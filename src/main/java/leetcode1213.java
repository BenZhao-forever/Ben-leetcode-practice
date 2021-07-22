import java.util.ArrayList;
import java.util.List;

/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/22
 * Project: Ben-leetcode-practice
 */
public class leetcode1213 {
    public static void main(String[] args) {
        readMeSet.addnewline("https://leetcode.com/problems/intersection-of-three-sorted-arrays/", 1213);
    }
    public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        int m = arr1.length - 1;
        int n = arr2.length - 1;
        int q = arr3.length - 1;
        List<Integer> list = new ArrayList<>();
        while (m != -1 && n != -1 && q != -1) {
            if (arr1[m] == arr2[n] && arr2[n] == arr3[q]) {
                list.add(arr1[m]);
                m--;
                n--;
                q--;
            }else {
                int max = Math.max(arr1[m], Math.max(arr2[n], arr3[q]));
                if (max == arr1[m]) {
                    m--;
                }
                if (max == arr2[n]) {
                    n--;
                }
                if (max == arr3[q]) {
                    q--;
                }
            }
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            list2.add(list.get(i));
        }
        return list2;
    }
}
