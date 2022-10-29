import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animal = new ArrayList<Animal>();
       Cat c1=new Cat();
       animal.add(c1);
       Dog d1=new Dog();
        animal.add(d1);
        Cat c2=new Cat();
        animal.add(c1);
        Dog d2=new Dog();
        animal.add(d2);
        Cat c3=new Cat();
        animal.add(c1);
        Dog d3=new Dog();
        animal.add(d3);
        for (int i=0; i<animal.size(); i++){
            animal.get(i).makeNoice();
            animal.get(i).eat();
        }
    }
}