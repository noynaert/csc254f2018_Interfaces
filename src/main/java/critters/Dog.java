package critters;

public class Dog extends Mammal implements Pet {

    String trick = "Fetches";
    String name = "?????";

    public Dog(double weight, String name, String trick){
        super(weight);
        symbol = CritterIcons.DOG;
        this.name = name;
        this.trick = trick;
    }
    public Dog(double weight, String name){
        this(weight, name, "Fetches");
    }


    @Override
    public String getMovement() {
        return "walks";
    }


    @Override
    public String getTrick() {
        return "Fetches";
    }

    @Override
    public String getName() {
        return name;
    }
}
