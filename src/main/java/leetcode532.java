import java.util.HashSet;

public class leetcode532 {
    public static void main(String[] args) {

    }
    public static int findPairs(int[] nums, int k){
        HashSet<Integer> set = new HashSet<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]-k)) {
                result++;
            }
            if (set.contains(nums[i] + k)) {
                result++;
            }
        }
        return result/2;
    }
}
