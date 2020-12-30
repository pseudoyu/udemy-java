public class LastDigitChecker {

    public static boolean isValid(int num) {

        if (num <= 1000 && num >= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if (isValid(num1) == false || isValid(num2) == false || isValid(num3) == false) {
            return false;
        }

        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        int lastDigit3 = num3 % 10;

        if (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3) {
            return true;
        } else {
            return false;
        }
    }
}
