package pt.utad.mei.aps.AbstractFactory;

public class LightElectric implements Vehicle{
    @Override
    public String getMotor() {
        return "Ventoinha 100cv";
    }

    @Override
    public void Show() {
        System.out.println(this.getMotor());
    }
}
