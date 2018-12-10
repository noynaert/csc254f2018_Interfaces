package critters;

public class Animal {
    String symbol = "?";
    double weight;

    public Animal(double weight){
        this.weight = weight;
    }
    public  String toString(){
        return String.format("%2s %5f.1 kg", symbol, weight);
    }

}
