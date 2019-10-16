public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        double tempNum1 = num1 * 1000; //3.1756 * 1000 = 3175.6
        double tempNum2 = num2 * 1000; //3.175 * 1000 = 3175

        int r1 = (int)tempNum1;
        int r2 = (int)tempNum2;

        if (r1 == r2) {
            return true;
        }
        return false;
    }
}
