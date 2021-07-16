/**
 * Package: PACKAGE_NAME
 * Created by Ben Zhao on 2021/7/16
 * Project: Ben-leetcode-practice
 */
public class ArrayReader {
    private int[] array;
    public ArrayReader(int[] array) {
        this.array = array;
    }
    public int get(int index) {
        if (index >= array.length) {
            return Integer.MAX_VALUE;
        }
        return array[index];
    }
}
