public class Main {
    public static void main(String[] args) {
        System.out.println("Test Cases for Fraction Class");
        System.out.println();
        Fraction f1 = new Fraction(3,4);
        Fraction f2 = new Fraction(5,7);
        System.out.println("Print f1, should be 3/4:  "+f1);
        System.out.println("Print f2, should be 5/7:  "+f2);
        System.out.println();
        System.out.println("Value f1, should be 0.75: "+f1.getValue());
        System.out.printf ("Value f2, should be 0.71: %.2f\n",f2.getValue());
        System.out.println();
        System.out.println("f1 + f2, should be 41/28: "+Fraction.add(f1,f2));
        System.out.println("f1 - f2, should be  1/28: "+Fraction.subtract(f1,f2));
        System.out.println("f1 * f2, should be 15/28: "+Fraction.multiply(f1,f2));
        System.out.println("f1 / f2, should be 21/20: "+Fraction.divide(f1,f2));
        System.out.println();
        Fraction f3 = new Fraction(60,108);
        System.out.println("60/108 reduced should be 5/9: "+Fraction.reduce(f3));
        Fraction f4 = new Fraction(52,117);
        System.out.println("52/117 reduced should be 4/9: "+Fraction.reduce(f4));
        System.out.println();
        System.out.println("GCD of 60 & 108 should be 12: "+Fraction.gcd(60,108));
        System.out.println("GCD of 52 & 117 should be 13: "+Fraction.gcd(52,117));
    }
}