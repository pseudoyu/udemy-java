import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] array) {

        int temp;

        System.out.println("Array = " + Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("Reversed Array = " + Arrays.toString(array));
    }
}
