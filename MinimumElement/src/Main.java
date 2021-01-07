import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the count: ");
        int count = MinimumElement.readInteger();
        System.out.println("Enter the array:");
        int[] array = MinimumElement.readElements(count);
        int min = MinimumElement.findMin(array);
        System.out.println("The min value is: " + min);
    }
}
