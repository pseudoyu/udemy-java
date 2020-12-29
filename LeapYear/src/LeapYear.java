public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year >= 1) {
            if (year <= 9999) {
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
