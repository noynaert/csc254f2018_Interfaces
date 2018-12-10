package critters;

public class Dog extends Mammal {
    public Dog(double weight){
        super(weight);
        symbol = CritterIcons.DOG;
    }
    @Override
    public String getMovement() {
        return "walks";
    }

}
