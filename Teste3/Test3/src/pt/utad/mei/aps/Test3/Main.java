package pt.utad.mei.aps.Test3;

public class Main {
    public static void main(String[] args) {
        Selector selector1 = new Selector(new Columns());
        System.out.println(selector1.select("a lot of information in columns"));

        Selector selector2 = new Selector(new Lines());
        System.out.println(selector2.select("a lot of information in lines"));

        Selector selector3 = new Selector(new Pizza());
        System.out.println(selector3.select("a lot of information in pizza"));

        Selector selector4 = new Selector(new Web());
        System.out.println(selector4.select("a lot of information in web"));

    }
}