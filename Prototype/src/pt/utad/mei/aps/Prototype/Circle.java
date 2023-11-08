package pt.utad.mei.aps.Prototype;

public class Circle extends Shape{

    private int radius;

    public Circle(int radius, int x, int y, String color) {
        super(x, y, color);
        this.radius = radius;
    }

    public Circle(Circle target) {
        super(target);
        if(target != null)
            this.radius = target.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
