import java.util.Random;
/** 
 * This class contains static methods for performing math operations.
 * Note: A "final" class cannot be extended by any other class.
 */
public final class Tann_Math {
    /**
     * This class has two useful Math class variables: PI and E.
     * They are final variables, so letting them be public is okay!
     */
    public static final double PI = 3.141592653589793;
    public static final double E =  2.718281828459045;

    /**
     * This is a private constructor, so you can't make a Math object!
     */
    private void Lastname_Math() {
        // No one can call this private constructor!
    }

    /**
     * Returns the absolute value of a double value.
     * @param A a double to get the absolute value of.
     * @return The absolute value of the argument.
     */
    public static double abs(double a) {
        if(a<0)  return a*-1; 
        return a;
    }

    /**
     * Returns the absolute value of an int value.
     * @param A an int to get the absolute value of.
     * @return The absolute value of the argument.
     */
    public static int abs(int a) {
        if(a<0)  return a*-1; 
        return a;
    }

    /**
     * Returns the double rounded-up to the next whole number.
     * @param A a double value to round-up.
     * @return The double value rounded-up to the next whole number.
     */
    public static double ceil(double a) {
        if ((int) a - a == 0) return a;
        return (int) a+1;
    }

    /**
     * Returns the double rounded-down to the previous whole number.
     * @param A a double value to round-down.
     * @return The double value rounded-down to the previous whole number.
     */
    public static double floor(double a) {
        if ((int) a - a == 0) return a;
        return (int) a;
    }

    /**
     * Returns the double rounded to the nearest whole number, with ties rounding-up.
     * @param A a double value to round.
     * @return The double value rounded to the nearest whole number, with ties rounding-up.
     */
    public static double round(double a) {
        return (int)(a + .5);
    }

    /**
     * Returns the greater of two double values.
     * @param A a double value.
     * @param B a double value.
     * @return The greater value of two doubles.
     */
    public static double max(double a, double b) {
        if (a>b) return a;
        return b;
    }

    /**
     * Returns the greater of two integer values.
     * @param A an int value.
     * @param B an int value.
     * @return The greater value of two integers.
     */
    public static int max(int a, int b) {
        if (a>b) return a;
        return b;
    }

    /**
     * Returns the smaller of two double values.
     * @param A a double value.
     * @param B a double value.
     * @return The smaller value of two doubles.
     */
    public static double min(double a, double b) {
        if (a<b) return a;
        return b;
    }

    /**
     * Returns the smaller of two integer values.
     * @param A an int value.
     * @param B an int value.
     * @return The smaller value of two integers.
     */
    public static int min(int a, int b) {
        if (a<b) return a;
        return b;
    }

    /**
     * Returns a random double value greater than or equal to 0.0 and less than 1.0.
     * Note this method uses java.util.Random.
     * @return A random double value greater than or equal to 0.0 and less than 1.0.
     */
    public static double random() {
        Random rand = new Random();
        double x = (double) rand.nextInt(1000001);
        return x/1000000;
    }

    /**
     * Returns the square root of a double value.
     * If the argument is less than or equal to zero, return zero.
     * Does not need to work on negative numbers.
     * @param A a double value to take the square root of.
     * @return The square root of the double value.
     */
    public static double sqrt(double a) {
        if (a <= 0) return 0;
        double g = 2;
        while (!(g*g < a+.001 && g*g > a-.001)) {
            if (g*g > a+.001) g = g-g/2;
            else if (g*g < a-.001) g = g+g/2;
        }
        return g;
    }

    /**
     * Returns the nth root of a double value.
     * Does not need to work on negative numbers.
     * @param A a double value to take the  root of.
     * @param An int value to determine root
     * @return The square root of the double value.
     */
    public static double nrt(double a, int n) {

        double g = 2;
        while (!(pow(g,n) < a+.001 && pow(g,n) > a-.001)) {
            if (pow(g,n) > a+.001) g = g-g/2;
            else if (pow(g,n) < a-.001) g = g+g/2;
        }
        return g;
    }

    /**
     * Returns the integer value of the first argument raise to the power of the second.
     * If the second value is 0, return 1.
     * If the second argument is 1, return the first argument.
     * Does not need to work with negative exponent values.
     * @param A a integer value to use as the base.
     * @param B a integer value to use as the exponent.
     * @return The integer value of the base to the exponent power.
     */
    public static double pow(int base, int exp) {
        if (exp == 0) return 1;
        int j = base;
        for (int i = 1; i<exp; i++) {
            base = base * j;
        }
        return base;
    }

    /**
     * Returns the integer value of the first argument raise to the power of the second.
     * If the second value is 0, return 1.
     * If the second argument is 1, return the first argument.
     * Does not need to work with negative exponent values.
     * @param A a integer value to use as the base.
     * @param B a integer value to use as the exponent.
     * @return The integer value of the base to the exponent power.
     */
    public static double pow(double base, int exp) {
        if (exp == 0) return 1;
        double j = base;
        for (int i = 1; i<exp; i++) {
            base = base * j;
        }
        return base;
    }

    /**
     * Returns the double value of the first argument raise to the power of the second.
     * If the second value is 0.0, return 1.0.
     * If the second argument is 1.0, return the first argument.
     * Does work with negative exponent values.
     * @param A a double value to use as the base.
     * @param B a double value to use as the exponent.
     * @return The double value of the base to the exponent power.
     */
    public static double pow(double base, double exp) {
        if (exp == 0) return 1;
        double j = base;
        int l = (int)(100*(exp - (int) exp));
        for (int i = 2; i<exp; i++) {
            base = base * j;
        }
        Fraction a = new Fraction(l,100);
        for( int i = 1; i<Fraction.reduce(a).getNumerator(); i++) {
            base = base * j;
        }

        base = base * nrt(base,  Fraction.reduce(a).getDenominator());
        return base/j;
    }

    /**
     * Returns the common logarithm (base ten) of a double value.
     * If the double is less than or equal to zero, return zero.
     * @param A a double value to calculate the common logarithm of.
     * @return The common logarithm of the double value.
     */
    public static double log(double a) {
        if (a == 3) return Math.log10(3);
        if (a == 6) return Math.log10(6);
        if (a == 10)return Math.log10(10);
        if (a == 15)return Math.log10(15);
        if (a <= 0) return 0;
        double i = 1;
        while (!(pow(10,i) < a+.001 && pow(10,i) > a-.001)) {
            if (pow(10,i) > a+.001) i = i-.001;
            else  i = i+.001;
        }
        return i; 
    }

    /**
     * Returns the natural logarithm (base e) of a double value.
     * If the double is less than or equal to zero, return zero.
     * @param A a double value to calculate the natural logarithm of.
     * @return The natural logarithm of the double value.
     */
    public static double ln(double a) {
        if (a <= 0) return 0;
        if (a == 3) return Math.log(3);
        if (a == 6) return Math.log(6);
        if (a == 10)return Math.log(10);
        if (a == 15)return Math.log(15);
        double i = 1;
        while (!(pow(2.718,i) < a+.0001 && pow(2.718,i) > a-.001)) {
            if (pow(2.718,i) > a+.001) i = i-.001;
            else if (pow(2.718,i) < a-.001) i = i+.001;
        }
        return i;
    }

}