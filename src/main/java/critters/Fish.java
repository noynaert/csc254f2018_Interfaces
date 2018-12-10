package critters;

public class Fish extends Animal{
    public Fish(double weight){
        super(weight);
        symbol = "F";
    }

    @Override
    public String getMovement() {
        return "Swims";
    }

}
