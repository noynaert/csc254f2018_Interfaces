import critters.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Animal a = new Salmon();
        Animal b = new Dog(4.2, "Fluffy", "Speaks");
        Animal c = new TropicalFish();
        Dog d = new Dog(5.0, "Spot");
        Mammal e = new Cat(.8, "Fluffy");
        Fish f = new Fish(1);
        Fish g = new Salmon();


        Animal[] zoo = new Animal[10];
        zoo[0] = new Lion(100);
        zoo[1] = new Salmon();
        zoo[2] = c;
        zoo[3] = new Dog(5.0, "Scamp");

        Pet[] home = new Pet[5];
        home[0] = new Dog(3.0, "Stripe");
        home[1] = new Cat(1.0, "Boots");
        home[2] = new TropicalFish();




        ArrayList<Animal> herd = new ArrayList<>();
        herd.add(new Lion(110));
        herd.add(b);
        herd.add(c);
        herd.add(d);
        herd.add((Animal) home[2]);
        herd.add((Animal) home[0]);
        herd.add((Animal) home[1]);
        herd.add(f);
        herd.add(g);


        //herd.add(new Animal(88.0));


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println("..................");
        print(herd);

    }
    public static void print(ArrayList<Animal> list){
        for(Animal critter: list){
            String s = critter.toString();
            if(critter instanceof Pet){
                Pet p = (Pet)critter;
                s = s + String.format(" Name: %s Trick: %s", p.getName(), p.getTrick());
            }
            System.out.println(s);
        }
    }

}
