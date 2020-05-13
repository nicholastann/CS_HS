public class Cow extends Mammal {
    public Cow() {
        setName("Amy Schumer");
        setNoise("Moo");
    }
    public Cow (String name, String noise) {
        super(name, noise);
    }
    
    public String speak() {
        return getNoise();
    }
    
    public String milk() {
        return getName() + " produces milk";
    }
    
}