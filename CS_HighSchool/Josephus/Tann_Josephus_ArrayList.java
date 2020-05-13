
import java.util.Scanner;
import java.util.ArrayList;
public class Tann_Josephus_ArrayList {
    public static void main(String[] args) {
        // 1. SCAN IN # PPL AND KILL #
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people are there?");
        int numPeople = scan.nextInt();
        System.out.println("What is the kill number?");
        int killNum = scan.nextInt();

        // 2. CALCULATE THE SURVIVOR #
        int survivorNum = calc(numPeople, killNum);

        // 3. PRINT OUT SURVIVOR #
        System.out.println("The survivor is spot #: "+survivorNum);
    }

    public static int calc(int numPeople, int killNum) {
        ArrayList<Integer> people = new ArrayList<Integer>(numPeople);
        int selected = killNum - 1;

        for(int i = 0; i < numPeople; i++) {
            people.add(i+1);
        }

        while (people.size() > 1) {	
            people.remove(selected);
            numPeople--;
            if (numPeople > 0) {
                selected = (selected + killNum - 1) % numPeople;
            }
        }

        return people.get(0);
    }
}
