import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animal = new ArrayList<>();
        animal.add(new Cat());
        animal.add(new Dog());
        animal.add(new Cat());
        animal.add(new Dog());
        animal.add(new Cat());
        animal.add(new Dog());
        for (Animal value : animal) {
            value.makeNoice();
            value.eat();
        }
    }
}