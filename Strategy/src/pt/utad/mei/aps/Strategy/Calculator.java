package pt.utad.mei.aps.Strategy;

public class Calculator {
    private Multiplication strategy;

    public Calculator(Multiplication strategy){
        this.strategy = strategy;
    }

    public double calculate(double a, double b){
        return strategy.multiply(a, b);
    }
}
