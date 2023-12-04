package pt.utad.mei.aps.Composite;

public class Main {
    public static void main(String[] args) {
        var diagram = new Diagram();

        var triangle = new Triangle(3.0, 2.0);
        var circle = new Circle(2.0);
        var line = new Line(3.0);

        diagram.add(triangle);
        diagram.add(circle);
        diagram.add(line);

        var objects = diagram.getObjects();

        for(var object: objects){
            System.out.println("Object " + object);
        }

        diagram.draw("red");

    }
}