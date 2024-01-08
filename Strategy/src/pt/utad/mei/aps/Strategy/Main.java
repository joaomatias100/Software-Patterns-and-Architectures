package pt.utad.mei.aps.Strategy;

public class Main {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator(new Integer());
        System.out.println(calculator1.calculate(0.8, 0.8));

        Calculator calculator2 = new Calculator(new Normal());
        System.out.println(calculator2.calculate(0.8, 0.8));
    }
}