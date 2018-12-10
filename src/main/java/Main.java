import critters.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Animal a = new Salmon();
        Animal b = new Dog(4.2);
        Animal c = new TropicalFish();
        Dog d = new Dog(5.0);
        Mammal e = new Cat(.8);
        Fish f = new Fish(1);
        Fish g = new Salmon();


        Animal[] zoo = new Animal[10];
        zoo[0] = new Lion(100);
        zoo[1] = new Salmon();
        zoo[2] = c;
        zoo[3] = new Dog(5.0);

        ArrayList<Animal> herd = new ArrayList<>();
        herd.add(new Lion(110));
        herd.add(b);
        //herd.add(new Animal(88.0));


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }

}
