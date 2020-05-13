public class Dog extends Mammal {
    public Dog() {
        setName("Faido");
        setNoise("Woof");
    }
    public Dog (String name, String noise) {
        super(name, noise);
    }
    
    public String speak() {
        return getNoise();
    }
    
    public String fetch() {
        return getName() + " got the stick!";
    }
    
}