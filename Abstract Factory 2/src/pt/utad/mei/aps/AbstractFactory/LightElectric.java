package pt.utad.mei.aps.AbstractFactory;

public class LightElectric implements Vehicle{

    @Override
    public String getMotor() {
        return "Electric";
    }

    @Override
    public void Show() {
        System.out.println("Light: " + this.getMotor());
    }
}
