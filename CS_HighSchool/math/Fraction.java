public class Fraction {
    private int numerator;
    private int denominator;
    /**
     * This is the default constructor.
     * Starts fraction as 0/1.
     */
    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    /**
     * This is an overloaded constructor.
     * Initializes fraction using params.
     * @param A numerator to use.
     * @param A denominator to use.
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Accessor method, returns numerator.
     * @return This fraction's numerator.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Accessor method, returns denominator.
     * @return This fraction's denominator.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Setter method, sets numerator to param.
     * @param Sets this fraction's numerator to param.
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Setter method, sets denominator to param.
     * @param Sets this fraction's denominator to param.
     */
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    /**
     * This method returns the decimal value of this fraction.
     * @return This fraction's value as a decimal.
     */
    public double getValue() {
        return (double)numerator/denominator;
    }

    /**
     * This method overrides Object's toString
     * @return Fraction as "#/#".
     */
    public String toString() {
        return numerator+"/"+denominator;
    }

    /**
     * This method adds two fractions together.
     * @param A fraction augend.
     * @param A fraction addend.
     * @return A fraction that is the sum of the params.
     */
    public static Fraction add(Fraction a, Fraction b) {
        int newDenominator = a.getDenominator() * b.getDenominator();
        int newNumerator = a.getDenominator() * b.getNumerator() + b.getDenominator() * a.getNumerator();
        return new Fraction(newNumerator, newDenominator);
    }

    /**
     * This method subtracts two fractions together.
     * @param A fraction subtrahend.
     * @param A fraction minuend.
     * @return A fraction that is the subtraction of the params.
     */
    public static Fraction subtract(Fraction a, Fraction b) {
        int newDenominator = a.getDenominator() * b.getDenominator();
        int newNumerator = b.getDenominator() * a.getNumerator() - a.getDenominator() * b.getNumerator();
        return new Fraction(newNumerator, newDenominator);
    }

    /**
     * This method multiplies two fractions together.
     * @param A fraction multiplicand.
     * @param A fraction multiplier.
     * @return A fraction that is the multiple of the params.
     */
    public static Fraction multiply(Fraction a, Fraction b) {
        int newDenominator = a.getDenominator() * b.getDenominator();
        int newNumerator = a.getNumerator() * b.getNumerator();
        return new Fraction(newNumerator, newDenominator);
    }

    /**
     * This method divides two fractions together.
     * @param A fraction dividend.
     * @param A fraction divisor.
     * @return A fraction that is the division of the params.
     */
    public static Fraction divide(Fraction a, Fraction b) {
        int newDenominator = a.getDenominator() * b.getNumerator();
        int newNumerator = a.getNumerator() * b.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    /**
     * This method reduces a fraction.
     * @param A fraction reduce.
     * @return A fraction that is reduced.
     */
    public static Fraction reduce(Fraction a) {
        int newDenominator = a.getDenominator() / gcd(a.getDenominator(), a.getNumerator());
        int newNumerator = a.getNumerator() / gcd(a.getDenominator(), a.getNumerator());
        return new Fraction(newNumerator, newDenominator);
    }

    /**
     * This method reciprocates a fractions.
     * @param A fraction to reciprocate
     * @return A reciprocated fraction of the params.
     */
    public Fraction reciprocal(Fraction a) {
        int newDenominator = a.getNumerator();
        int newNumerator = a.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    /**
     * This method finds the GCD of two numbers.
     * @param A number to find the GCD of.
     * @param A number to find the GCD of.
     * @return The GCD of the two parameters.
     */
    public static int gcd(int a, int b) {
        while(a > 0 && b > 0) {
            if(a < b) {
                b %= a;
            }
            else {
                a %= b;
            }
        }
        return a + b;
    }
}