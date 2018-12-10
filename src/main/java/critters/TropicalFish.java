package critters;

public class TropicalFish extends Fish  implements Pet{
    public TropicalFish(){
        super(0.1);
        symbol = CritterIcons.TROPICALFISH;
    }


    @Override
    public String getTrick() {
        return "Goes to the surface and waits for food";
    }

    @Override
    public String getName() {
        return "";
    }
}
