package pt.utad.mei.aps.AbstractFactory;

public class LightCombustion implements Vehicle{
    @Override
    public String getMotor() {
        return "Diesel 100cv";
    }

    @Override
    public void Show() {
        System.out.println(this.getMotor());
    }
}
