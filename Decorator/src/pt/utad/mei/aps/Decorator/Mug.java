package pt.utad.mei.aps.Decorator;

public class Mug implements PrintableObject{

    private String name;
    private double price;

    public Mug() {
        name = "Mug";
        price = 15;
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
