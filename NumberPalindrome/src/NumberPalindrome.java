public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        number = Math.abs(number);
        int reverse = 0;
        int lastDigit;
        int originalNumber = number;


        while (number > 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

        if (reverse == originalNumber) {
            return true;
        } else {
            return false;
        }

    }
}
