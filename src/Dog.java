public class Dog extends Animal {

    Dog() {
        super("Dog");
//        super("Dog"); Not possible to remove super call
    }
    public void eat() {
        System.out.println("meat");
    }

    public void makeNoise() {
        System.out.println("wof wof");
    }
}
