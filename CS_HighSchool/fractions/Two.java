public class Two extends One {
    public int b, c;
    public Two() {
        this(3,4,5);
    }

    public Two (int a) {
        this(a,4,5);
    }

    public Two (int a, int b) {
        this(a,b,5);
    }

    public Two (int a, int b, int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println(this);
    }

    public String toString() {
        return "A: " +a+" B: "+b+" C: "+c;
    }

    public String superValues() {
        return "A: " + super.a+" B: "+super.b;
    }
}