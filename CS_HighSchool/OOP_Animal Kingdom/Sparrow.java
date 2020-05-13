public class Sparrow extends Bird {
    public Sparrow() {
        setName("Sporty");
        setNoise("Caw");
    }
    public Sparrow(String name, String noise) {
        super(name, noise);
    }
    
    public String speak() {
        return getNoise();
    }
    
    public String sing() {
        return getNoise() + " " + getNoise() + " " + getNoise();
    }
    
}