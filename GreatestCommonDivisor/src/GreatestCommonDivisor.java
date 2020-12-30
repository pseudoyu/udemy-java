public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int last) {

        if (first < 10 || last < 10) {
            return -1;
        }

        int divisor = 2;
        int gcd = 0;

        while (divisor < first) {
            if (first % divisor == 0 && last % divisor == 0) {
                gcd = divisor;
            }
            divisor++;
        }

        return gcd;
    }
}
