import java.util.Scanner;
public class Tann_Josephus {
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
        boolean[] people = new boolean[numPeople];
        int answer = 0;
        int selected = 0;
        int qeue = numPeople;
        int skip = 0;
        boolean scan = true;
        int next = 0;
        int killskip;
        boolean getanswer = true;

        for(int i = 0; i < numPeople; i++) {
            people[i] = true;
        }

        if (qeue == numPeople) {
            selected = selected + (killNum -1);
            while (selected > numPeople-1) {
                selected = selected % (numPeople);
            }
            people[selected] = false;
            qeue--;
        }
        while (qeue > 1) {
            killskip = killNum;
            next = selected;
            scan = true;
            while (scan == true) {
                next++;
                if (next > numPeople-1) {
                    next = next % (numPeople);
                }
                if (people[next] == true) {
                    killskip--;
                }
                if (people[next] == false) {

                    selected++;
                }
                if (killskip == 0) {
                    selected = selected + (next - selected);
                    while (selected > numPeople-1) {
                        selected = selected % (numPeople);
                    }
                    people[selected] = false;
                    qeue--;
                    scan = false;

                }

            }

        }
        selected = 0;
        while (getanswer == true) {
            if (people[selected] == true) {
                answer = selected+1;
                getanswer = false;	
            }
            else {
                selected++;
            }
        }

        return answer;
    }
}