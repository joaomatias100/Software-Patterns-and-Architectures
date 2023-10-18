package pt.utad.mei.aps.FactoryMethod;

public class LightFactory extends VehicleFactory{

    @Override
    public Vehicle ConstructVehicle() {
        return new Light();
    }
}
