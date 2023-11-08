package pt.utad.mei.aps.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();

        Circle c1 = new Circle(10, 6, 6, "Red");
        shapes.add(c1);
        Circle c2 = (Circle) c1.clone();
        c2.setRadius(20);

        System.out.println("C1: " + c1.getRadius() + c1.getX() + c1.getY() + c1.getColor());
        System.out.println("C2: " + c2.getRadius() + c2.getX() + c2.getY() + c2.getColor());
    }
}