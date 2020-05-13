public abstract class Animal {
    private String name;
    private String noise;

    public Animal() {
        name = "No Name";
        noise = "mute";
    }

    public Animal (String name, String noise) {
        this.name = name;
        this.noise = noise;
    }

    public String getName() {return name; }
    public String getNoise() {return noise; }
    public void setName(String name) {this.name = name; }
    public void setNoise(String noise) {this.noise = noise; }

    public abstract String speak();
}