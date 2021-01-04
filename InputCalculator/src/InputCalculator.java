import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        long average = 0;

        while(true) {

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
            } else {
                break;
            }

            scanner.nextLine();
        }

        if (counter == 0) {
            average = 0;
        } else {
            average = Math.round(((double) sum / (double) counter));
        }

        scanner.close();
        System.out.printf("SUM = " + sum + " AVG = " + average);
    }
}
