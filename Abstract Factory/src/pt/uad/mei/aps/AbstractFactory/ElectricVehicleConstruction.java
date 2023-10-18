package pt.uad.mei.aps.AbstractFactory;


//concrete factory 2
public class ElectricVehicleConstruction implements VehicleFactory{
    @Override
    public Vehicle VehicleConstruction(VehicleType type) {
        switch(type){
            case LIGHT: return new LightElectric();
            case HEAVY: return new HeavyElectric();
            default: return null;
        }
    }
}
