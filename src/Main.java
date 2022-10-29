import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Cat1"));
        animals.add(new Dog());
        animals.add(new Cat("Cat2"));
        animals.add(new Dog());
        animals.add(new Cat("Cat3"));
        animals.add(new Dog());
        for (Animal value : animals) {
            value.makeNoise();
            value.eat();
        }
    }
}