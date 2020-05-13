public class One {
    public int a,b;
    public One() {
        this(1,2);
    }

    public One(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(this);
    }

    public String toString() {
        return "A: "+ a+" B: " + b;
    }
}

