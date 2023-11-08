package pt.utad.mei.aps.Prototype;

public abstract class Shape {

    private int x;
    private int y;
    private String color;

    public Shape(int x, int y, String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape(Shape target){
        this.x  = target.getX();
        this.y = target.getY();
        this.color = target.getColor();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public abstract Shape clone();
}
