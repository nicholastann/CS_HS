
public class Point {
    private int x;
    private int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getx() {
        return x;
    }
    public int gety() {
        return y;
    }
    
    public String tostring() {
        return "("+x+","+y+")";
        
    }
}