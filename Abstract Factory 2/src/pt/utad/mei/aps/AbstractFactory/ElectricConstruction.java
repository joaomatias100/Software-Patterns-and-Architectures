package pt.utad.mei.aps.AbstractFactory;

public class ElectricConstruction implements VehicleFactory{
    @Override
    public Vehicle VehicleConstruction(VehicleType type) {
        switch (type){
            case HEAVY: return new HeavyElectric();
            case LIGHT: return new LightElectric();
            default: return null;
        }
    }
}
