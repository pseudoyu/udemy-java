public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double decimalOne, double decimalTwo) {

        int intOne = (int) (decimalOne * 1000);
        int intTwo = (int) (decimalTwo * 1000);

        if (intOne == intTwo) {
            return true;
        }

        return false;
    }
}
