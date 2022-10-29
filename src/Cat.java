public class Cat extends Animal {

    public Cat(String name) {
        super(name); // Super always should be the first call in the constructor
        System.out.println(this.name);
        this.name = "Cat";
    }

    public void eat() {
        System.out.println(10);
    }

    @Override
    public void makeNoise() {
        System.out.println("meow");
    }

    // overloading - static polymorphism
    // overriding - static polymorphism
}
