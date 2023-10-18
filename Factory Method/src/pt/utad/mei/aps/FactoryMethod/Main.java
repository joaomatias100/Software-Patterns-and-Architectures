package pt.utad.mei.aps.FactoryMethod;

public class Main {
    public static void main(String[] args) {

        VehicleFactory factory1 = new LightFactory();
        Vehicle v1 = factory1.ConstructVehicle();
        v1.Show();

        VehicleFactory factory2 = new HeavyFactory();
        Vehicle v2 = factory2.ConstructVehicle();
        v2.Show();

    }
}