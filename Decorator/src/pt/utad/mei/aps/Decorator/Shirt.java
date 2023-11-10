package pt.utad.mei.aps.Decorator;

public class Shirt implements PrintableObject{

    private String name;
    private double price;

    public Shirt(){
        name = "Shirt";
        price = 25;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
