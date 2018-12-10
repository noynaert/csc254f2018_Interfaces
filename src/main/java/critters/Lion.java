package critters;

public class Lion extends Mammal {
    public Lion(double weight){
        super(weight);
        symbol = CritterIcons.LION;
    }

    @Override
    public String getMovement() {
        return "walks";
    }
}
