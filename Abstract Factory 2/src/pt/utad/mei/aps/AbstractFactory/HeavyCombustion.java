package pt.utad.mei.aps.AbstractFactory;

public class HeavyCombustion implements Vehicle{

    @Override
    public String getMotor() {
        return "Diesel";
    }

    @Override
    public void Show() {
        System.out.println("Heavy: " + this.getMotor());
    }
}
