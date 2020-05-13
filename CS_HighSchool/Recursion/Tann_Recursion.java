
public class Tann_Recursion {
    public static void main() {    
        for (int i = 0; i< 10; i++) {
            System.out.println(factorialr(i));
        }
        for (int i = 0; i< 10; i++) {
            System.out.println(factoriali(i));
        }
        for (int i = 1; i< 11; i++) {
            System.out.println(fibr(i));
        }
        for (int i = 0; i< 10; i++) {
            System.out.println(fibi(i));
        }
    }

    public static int factorialr(int x) {
        if (x < 2) {
            return 1;
        }
        return x * factorialr(x-1);
    }

    public static int factoriali(int x) {
        int r = 1;
        for (int i = 1; i <= x; i++) {
            r = r * i;
        }
        return r;
    }

    public static int fibr(int x) {
        if (x == 1) return 0;
        if (x == 2) return 1;
        if (x > 2) return fibr(x-2) + fibr(x-1);
        return 0;
    }

    public static int fibi(int x) {
        int z = 0;
        int o = 1;
        int t = 2;
        for (int i = 0; i < x; i++) {
            z = o;
            o = t;
            t = z + o;           
        }
        return z;

    }
}