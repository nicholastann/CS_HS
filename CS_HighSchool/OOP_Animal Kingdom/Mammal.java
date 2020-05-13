public abstract class Mammal extends Animal{
    public Mammal() {
        setName("Fuzzball");
        setNoise("growl");
    }

    public Mammal(String name, String noise) {
        super(name, noise);
    }

    public String shed() {
        return getName() + " is shedding!";
    }
}