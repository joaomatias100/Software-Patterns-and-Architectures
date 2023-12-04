package pt.utad.mei.aps.Composite;

public class Triangle implements DiagramObject{

    private double height;
    private double width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(String color) {
        System.out.println("Triangle with height " + height + " and width " + width + " and color " + color);
    }

    @Override
    public String toString() {
        return "Triangle {" + "height " + height + " width " + width + '}';
    }
}
