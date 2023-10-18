package pt.uad.mei.aps.AbstractFactory;

public class LightElectric implements Vehicle{
    @Override
    public String getMotor() {
        return "300cv 100kW";
    }

    @Override
    public void Show() {
        System.out.println("Light: " + this.getMotor());
    }
}
