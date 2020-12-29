public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int totalDay = (int) (minutes / 60 / 24);
            System.out.println(minutes + " min = " + (totalDay / 365) + " y and " + (totalDay % 365) + " d");
        }
    }
}