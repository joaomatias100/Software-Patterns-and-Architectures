package pt.uad.mei.aps.AbstractFactory;

public class HeavyCombustion implements Vehicle{
    @Override
    public String getMotor() {
        return "Diesel 4000cc 400cv";
    }

    @Override
    public void Show() {
        System.out.println("Heavy: " + this.getMotor());
    }
}
