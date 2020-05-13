public class Three extends Two {
    public int b,c;
    public Three() {
        this(6,7,8);
    }
    public Three(int a) {
        this(a,7,8) ;
    }
    public Three(int a, int b) {
        this(a,b,8);
    }
    public Three(int a, int b, int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println(this);
    }
    public String toString() {
        return "A: "+a+" B: " +b+" C: "+c;
    }
    public String superValues() {
        return "A: "+super.a+ " B: "+super.b+" C: "+ super.c;
    }
}