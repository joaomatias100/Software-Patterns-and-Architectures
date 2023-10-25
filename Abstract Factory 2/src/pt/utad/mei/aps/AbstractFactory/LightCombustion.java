package pt.utad.mei.aps.AbstractFactory;

public class LightCombustion implements Vehicle{

    @Override
    public String getMotor() {
        return "Diesel";
    }

    @Override
    public void Show() {
        System.out.println("Light: " + this.getMotor());
    }
}
