package pt.utad.mei.aps.Observer;

public class Client implements Observer{
    @Override
    public void update(String product) {
        System.out.println(hashCode() + ": Product " + product + " is in stock");
    }
}
