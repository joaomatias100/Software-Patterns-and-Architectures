package pt.utad.mei.aps.AbstractFactory;

public class HeavyElectric implements Vehicle{
    @Override
    public String getMotor() {
        return "Ventoinha 4000cv";
    }

    @Override
    public void Show() {
        System.out.println(this.getMotor());
    }
}
