package pt.utad.mei.aps.AbstractFactory;

public class HeavyCombustion implements Vehicle{
    @Override
    public String getMotor() {
        return "Diesel 4000cv";
    }

    @Override
    public void Show() {
        System.out.println(this.getMotor());
    }
}
