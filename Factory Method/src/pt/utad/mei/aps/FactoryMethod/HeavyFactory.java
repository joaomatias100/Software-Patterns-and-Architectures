package pt.utad.mei.aps.FactoryMethod;

public class HeavyFactory extends VehicleFactory{

    @Override
    public Vehicle ConstructVehicle() {
        return new Heavy();
    }
}
