public abstract class Bird extends Animal{
    public Bird() {
        setName("Pollie");
        setNoise("chirp");
    }

    public Bird(String name, String noise) {
        super(name, noise);
    }

    public String fly() {
        return getName() + "flew away!";
    }
}