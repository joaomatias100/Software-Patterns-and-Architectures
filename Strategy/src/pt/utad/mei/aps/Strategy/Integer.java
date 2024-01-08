package pt.utad.mei.aps.Strategy;

public class Integer implements Multiplication{
    @Override
    public double multiply(double a, double b) {
        return Math.round(a * b);
    }
}
