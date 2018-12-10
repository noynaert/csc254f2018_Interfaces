package critters;

public class Cat extends Mammal{
    public Cat(double weight){
        super(weight);
        symbol = CritterIcons.CAT;
    }
    @Override
    public String getMovement() {
        return "walks";
    }
}
