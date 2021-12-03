import java.util.Random;

public class randomCase {
    public static void main(String[] args) {

    }
    public static int[] randomArray(int size, int from, int to) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = from + random.nextInt(to - from);
        }
        return array;
    }

}
