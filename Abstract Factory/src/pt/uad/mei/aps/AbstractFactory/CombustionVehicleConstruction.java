package pt.uad.mei.aps.AbstractFactory;


//concrete factory 1
public class CombustionVehicleConstruction implements VehicleFactory{

    @Override
    public Vehicle VehicleConstruction(VehicleType type) {
        switch(type){
            case LIGHT: return new LightCombustion();
            case HEAVY: return new HeavyCombustion();
            default: return null;
        }
    }
}
