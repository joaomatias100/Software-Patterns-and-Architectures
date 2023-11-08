package pt.utad.mei.aps.AbstractFactory;

public class ElectricFactory implements VehicleFactory{
    @Override
    public Vehicle ConstructVehicle(VehicleType type) {
        switch(type){
            case HEAVY: return new HeavyElectric();
            case LIGHT: return new LightElectric();
            default: return null;
        }
    }
}
