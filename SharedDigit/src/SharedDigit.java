public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {

        if (num1 <10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        int firstDigit1 = num1 / 10;
        int lastDigit1 = num1 % 10;
        int firstDigit2 = num2 / 10;
        int lastDigit2 = num2 % 10;

        if (firstDigit1 == firstDigit2 || firstDigit1 == lastDigit2 || lastDigit1 == firstDigit2 || lastDigit1 == lastDigit2) {
            return true;
        } else {
            return false;
        }
    }
}
