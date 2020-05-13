import java.util.Scanner;
import java.io.File;
import java.util.Random;
public class Tann_HangMan {
    public static void main() throws Exception {
        boolean win = false;
        String[] words = new String[13];
        File file = new File("Words.txt");
        Scanner scan = new Scanner(file);
        int spot = 0;
        while(scan.hasNextLine()) {
            words[spot] = scan.nextLine();
            spot++;
        }
        scan.close();
        //for(String s : words) {
        //  System.out.println(s);
        //}

        Random rand = new Random();
        int pick = rand.nextInt(words.length);
        String answer = words[pick];
        //System.out.println("answer: " + answer);

        String display = "";
        String incorrect = "";
        int tries = 5;

        for (int i = 0; i<answer.length(); i++) {
            display+= "_";
        }

        scan = new Scanner(System.in);
        System.out.println("Let's play hangmeme");
        while(tries > 0) {
            System.out.println("You have " + tries+ " tries");
            for (int i = 0; i < display.length(); i++) {
                System.out.print(display.substring(i,i+1) + " ");
            }
            System.out.println();
            System.out.println("Guess a letter: ");
            String letter = scan.nextLine();
            if (answer.indexOf(letter) == -1) {
                incorrect += letter;
                tries--;
            }
            else {
                for (int i = 0; i<answer.length(); i++) {
                    if (letter.equals(answer.substring(i,i+1))) {
                        display = display.substring(0,i)+letter+display.substring(i+1,display.length());

                    }

                }
            }
            if (answer.equals(display)) {
                System.out.println("You Win!");
                win = true;
                break;
            }
            System.out.println("Incorrect letters: " + incorrect);
            System.out.println();
        }
        if (win == false) System.out.println("Game Over! You Ran Out Of Tries!"); 
        System.out.println(answer);
    }
}
