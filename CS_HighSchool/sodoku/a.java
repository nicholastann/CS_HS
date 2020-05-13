
public class a {
     public static void main() {   
        double sum = 2;
        int i = 2;
        while (i < 101) {
            sum = sum * (i / (i-1)) * (i / (i + 1));
            System.out.println(sum);
            i = i + 2;
        }
        System.out.println(sum);
    }
}