package pt.utad.mei.aps.FactoryMethod;

public class Heavy implements Vehicle{


    @Override
    public String getMotor() {
        return "Diesel 4000cc 400cv";
    }

    @Override
    public void Show() {
        System.out.println("Heavy: " + this.getMotor());
    }
}
