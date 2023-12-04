package pt.utad.mei.aps.Composite;

public class Line implements DiagramObject{

    private double length;

    public Line(double length) {
        this.length = length;
    }

    @Override
    public void draw(String color) {
        System.out.println("Line with length " +  length);
    }

    @Override
    public String toString() {
        return "Line {" + "length " + length + '}';
    }
}
