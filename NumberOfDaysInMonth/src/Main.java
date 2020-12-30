public class Main {
    public static void main(String[] args) {
        boolean result = NumberOfDaysInMonth.isLeapYear(2017);
        System.out.println(result);

        int daysResult = NumberOfDaysInMonth.getDaysInMonth(4, 2018);
        System.out.println(daysResult);
    }
}
