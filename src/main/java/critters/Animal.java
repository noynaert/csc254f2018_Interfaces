package critters;

public abstract class Animal {
    String symbol = "?";
    double weight;

    public Animal(double weight){
        this.weight = weight;
    }
    public  String toString(){
        return String.format("%-2s %5f.1 kg  Moves by %s", symbol, weight, getMovement());
    }

    public abstract String getMovement();


}
