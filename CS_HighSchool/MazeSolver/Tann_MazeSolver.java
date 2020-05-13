import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
public class Tann_MazeSolver {
    public static void main() {

        String fileName = "";
        for (int i = 0; i <= 6; i++) {
            fileName = "Maze" + i + ".txt";
            Scanner scan = null;

            try {
                scan = new Scanner(new File(fileName));
            }
            catch (Exception e) {
                System.out.println("File not found!");
            }

            if(scan != null) {
                ArrayList<Point> coord = readMaze(fileName, scan);
                if(solvable(coord)) {
                    System.out.println(fileName + " is solvable!" );
                }
                else {
                    System.out.println(fileName + " is not solvable!" );
                }
            }
        }
    }

    public static ArrayList<Point> readMaze(String fileName, Scanner scan) {

        ArrayList<Point> coord = new ArrayList<Point>();
        Point one = null;
        Point two = null;
        int c = 0;

        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == ' ') coord.add(new Point(i,c)); 
                if (line.charAt(i) == '1') one = new Point(i,c); 
                if (line.charAt(i) == '2') two = new Point(i,c); 
            }
            c++;
        }

        coord.add(0, one);
        coord.add(two);
        scan.close();
        return coord;
    }

    public static boolean adjacent(Point a, Point b) {
        if ((a.getx() -1 == b.getx()) && (a.gety() == b.gety())) return true;
        if ((a.getx() +1 == b.getx()) && (a.gety() == b.gety())) return true;
        if ((a.getx() == b.getx()) && (a.gety() +1 == b.gety())) return true;
        if ((a.getx() == b.getx()) && (a.gety() -1 == b.gety())) return true;

        return false;
    }

   public static boolean solvable(ArrayList<Point> coord) {
        ArrayList<Point> queue = new ArrayList<Point>();
        queue.add(coord.get(0));
        coord.remove(0);
        while (queue.size() > 0) { 
            if (adjacent(queue.get(0), coord.get(coord.size()-1))) {
                return true;
            }
            for (int x = 0; x < coord.size()-2; x++) {
                if (adjacent(queue.get(0), (coord.get(x)))) {
                    queue.add(coord.get(x));
                    coord.remove(x);

                }
            }
            
            queue.remove(0);

        }

        return false;
    }
}
