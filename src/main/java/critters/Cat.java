package critters;

public class Cat extends Mammal  implements Pet{
    private String name;

    public Cat(double weight, String name){
        super(weight);
        symbol = CritterIcons.CAT;
        this.name = name;
    }
    @Override
    public String getMovement() {
        return "walks";
    }
    @Override
    public String getTrick(){
        return "chases laser pointer";
    }
    @Override
    public String getName(){
        return name;
    }
}
