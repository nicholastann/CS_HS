public class NumMain {
    public static void main(String[] args) {
         System.out.println("Creating a One object.");
        One one = new One();
        System.out.println("Creating a Two object.");
        Two two = new Two();
        System.out.println("Creating a Three object.");
        Three three = new Three();
        
        System.out.println("Printing Two's Super val");
        System.out.println(two.superValues());
        
        System.out.println("Printing Three's Super val");
        System.out.println(three.superValues());
    }
}