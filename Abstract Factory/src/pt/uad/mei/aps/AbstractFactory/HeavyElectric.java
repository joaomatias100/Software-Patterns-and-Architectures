package pt.uad.mei.aps.AbstractFactory;

public class HeavyElectric implements Vehicle{
    @Override
    public String getMotor() {
        return "2000cv 600kW";
    }

    @Override
    public void Show() {
        System.out.println("Heavy: " + this.getMotor());
    }
}
