public class Duck extends Bird {
    public Duck() {
        setName("Donald");
        setNoise("Quack");
    }
    public Duck(String name, String noise) {
        super(name, noise);
    }
    
    public String speak() {
        return getNoise();
    }
    
    public String swim() {
        return getName() + " is swimming in a lake!";
    }
    
}