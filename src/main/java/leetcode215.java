import java.util.Arrays;
import java.util.Random;

public class leetcode215 {
    public static void main(String[] args) {

    }
    public static int findKthLargest(int[] nums, int k) {
        return quickSearch(nums, k, 0, nums.length);
    }
    public static int findKthLorgestBruteForce(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
    public static int quickSearch(int[] nums, int k, int start, int end) {

        return 0;
    }

}
