package utilities;

public class Utils {
    public static void check(boolean argument, String msg) {
        if (!argument) {
            throw new IllegalArgumentException(msg);
        }
    }

    /**
     * Converts an integer to boolean
     * @param iva_integerBoolean the integer
     * @return true if int = 1 otherwise false
     */
    public static boolean convertIntToBoolean(int iva_integerBoolean) {
        return iva_integerBoolean == 1;
    }

    public static boolean isStringEmpty(String iob_string) {
        return iob_string.trim().isEmpty();
    }
}
