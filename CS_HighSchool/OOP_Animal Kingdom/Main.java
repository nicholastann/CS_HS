public class Main {
    public static void main(String[] args) {

        //Animal a1 = new Animal();
        //Animal a2 = new Mammal();
        Animal a3 = new Dog();
        Dog myDog = new Dog("Buddy", "bark");
        Bird myBird = new Sparrow("Pidgey", "screech");
        //Mammal m1 = new Mammal();
        Mammal m2 = new Dog();
        Cow c1 = new Cow();
        //Bird b1 = new Bird();
        Bird b2 = new Duck();
        Duck d1 = new Duck();

        //System.out.println(a1.speak());
        //System.out.println(a2.shed());
        //System.out.println(a3.fetch());
        //System.out.println(m1.shed());
        System.out.println(m2.shed());
        System.out.println(c1.milk());
        //System.out.println(b2.sing());
        System.out.println(d1.fly());
        System.out.println(myDog.fetch());
        //System.out.println(myBird.sing());
    }
}
