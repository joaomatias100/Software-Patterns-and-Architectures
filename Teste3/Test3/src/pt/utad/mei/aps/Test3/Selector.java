package pt.utad.mei.aps.Test3;

public class Selector {

    private Plotting strategy;

    public Selector(Plotting strategy){
        this.strategy = strategy;
    }

    public String select(String data){
        return strategy.plot(data);
    }
}
