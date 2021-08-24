public class reverseArray {
    public static void main(String[] args) {

    }
    public static void reverseArray(int[] arr, int[][] operations) {
        for (int i = 0; i < operations.length; i++) {
            int indexa = operations[i][0];
            int indexb = operations[i][1];
            while (indexa < indexb) {
                int temp = arr[indexa];
                arr[indexa++] = arr[indexb];
                arr[indexb--] = temp;
            }
        }
    }
}
