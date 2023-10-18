package pt.utad.mei.aps.FactoryMethod;

public class Light implements Vehicle{


    @Override
    public String getMotor() {
        return "Diesel 900cc 120cv";
    }

    @Override
    public void Show() {
        System.out.println("Light: " + this.getMotor());
    }
}
