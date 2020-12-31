import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            int order = counter + 1;

            System.out.println("Enter number #" + order + ": ");

            boolean isAnInt = in.hasNextInt();

            if (isAnInt) {
                int number = in.nextInt();
                counter++;
                sum += number;

                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }

            in.nextLine();
        }

        System.out.println("sum = " + sum);
        in.close();
    }
}
