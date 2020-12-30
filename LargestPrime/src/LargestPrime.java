public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number < 0) {
            return -1;
        }

        int divisor = 2;
        int prime = -1;

        while (divisor <= number) {

            if (number % divisor == 0) {
                number /= divisor;
            } else {
                divisor += 1;
            }

            prime = divisor;
        }
        return prime;
    }
}
