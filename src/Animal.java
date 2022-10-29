abstract public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract public void eat();

    abstract public void makeNoise();
}
