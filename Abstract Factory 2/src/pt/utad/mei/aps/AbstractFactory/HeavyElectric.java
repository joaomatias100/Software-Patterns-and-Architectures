package pt.utad.mei.aps.AbstractFactory;

public class HeavyElectric implements Vehicle{

    @Override
    public String getMotor() {
        return "Electric";
    }

    @Override
    public void Show() {
        System.out.println("Heavy: " + this.getMotor());
    }
}
