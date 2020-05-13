
public class Ackermann
{
    public static void main() {
        for (int i = 0; i<5; i++) { 
            for (int j = 0; j<4; j++) {
                System.out.println("A of "+i+" " + j+ " is " + ackermann(i,j));
            }
        }
    }

    public static int ackermann(int m, int n) {
        if (m==0) return n+1;
        if (n==0) return ackermann(m-1,1);
        return ackermann(m-1, ackermann(m,n-1));
    }
}
